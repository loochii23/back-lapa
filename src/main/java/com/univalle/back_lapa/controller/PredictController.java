package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/predict")
@CrossOrigin(origins = "*")
public class PredictController {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String LAMBDA_API_URL_RAPIFLEX = "https://1ftbmcrcxc.execute-api.us-east-1.amazonaws.com/prod/predict";
    private static final String LAMBDA_API_URL_RAPIPLAZO = "https://j2f50cq0wi.execute-api.us-east-1.amazonaws.com/prod/predict";


    @PostMapping
    public PredictResultDto predict(@RequestBody PredictDto predictDto) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        List<Integer> date = Arrays.asList(predictDto.year(), predictDto.month(), predictDto.day());
        PredictLambdaRequestDto predictLambdaRequestDto = PredictLambdaRequestDto.builder()
                .data(List.of(date))
                .build();

        HttpEntity<PredictLambdaRequestDto> entity = new HttpEntity<>(predictLambdaRequestDto, headers);
        String url = predictDto.productId().equals("1") ? LAMBDA_API_URL_RAPIFLEX : LAMBDA_API_URL_RAPIPLAZO;
        ResponseEntity<PredictLambdaResponseDto> response =
                restTemplate.postForEntity(url, entity, PredictLambdaResponseDto.class);

        Double generalPredictAmount = Objects.requireNonNull(response.getBody()).predictions().get(0);
        final Double[] balancePredictAmount = {Objects.requireNonNull(response.getBody()).predictions().get(0)};

        int loanAmountAverage = 250000;
        int generalPredictCount = (int) (generalPredictAmount / loanAmountAverage);
        final Integer[] balancePredictCount = {generalPredictCount};
        final Integer[] tempCount = {0};

        List<InvestorDto> investorDtoList = new ArrayList<>();

        predictDto.investors().stream()
                .sorted(Comparator.comparingInt(InvestorDto::priority))
                .forEach(investorDto -> {
                    if (balancePredictAmount[0] > 0) {

                        if (balancePredictAmount[0] >= investorDto.amount()) {

                            tempCount[0] = (int) (investorDto.amount()/loanAmountAverage);

                            investorDto = investorDto.toBuilder()
                                    .predictAmount(investorDto.amount())
                                    .predictCount(tempCount[0])
                                    .build();

                            balancePredictAmount[0] = balancePredictAmount[0] - investorDto.amount();
                            balancePredictCount[0] = balancePredictCount[0] - tempCount[0];

                        } else {
                            investorDto = investorDto.toBuilder()
                                    .predictAmount(balancePredictAmount[0])
                                    .predictCount(balancePredictCount[0])
                                    .build();
                            balancePredictAmount[0] = 0.0;
                            balancePredictCount[0] = 0;
                        }
                    } else {
                        investorDto = investorDto.toBuilder()
                                .predictAmount(balancePredictAmount[0])
                                .predictCount(balancePredictCount[0])
                                .build();
                    }
                    investorDtoList.add(investorDto);
                });

        return PredictResultDto.builder()
                .amount(generalPredictAmount)
                .balanceAmount(balancePredictAmount[0])
                .count(generalPredictCount)
                .balanceCount(balancePredictCount[0])
                .investorList(investorDtoList).build();
    }
}
