package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.PredictDto;
import com.univalle.back_lapa.dto.PredictLambdaRequestDto;
import com.univalle.back_lapa.dto.PredictLambdaResponseDto;
import com.univalle.back_lapa.dto.PredictResultDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/predict")
@CrossOrigin(origins = "*")
public class PredictController {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String LAMBDA_API_URL = "https://0ilw899ak9.execute-api.us-east-1.amazonaws.com/prod/predict";


    @PostMapping
    public PredictResultDto predict(@RequestBody PredictDto predictDto) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        List<Integer> date = Arrays.asList(predictDto.year(), predictDto.month(), predictDto.day());
        PredictLambdaRequestDto predictLambdaRequestDto = PredictLambdaRequestDto.builder()
                .data(List.of(date))
                .build();

        HttpEntity<PredictLambdaRequestDto> entity = new HttpEntity<>(predictLambdaRequestDto, headers);

        ResponseEntity<PredictLambdaResponseDto> response =
                restTemplate.postForEntity(LAMBDA_API_URL, entity, PredictLambdaResponseDto.class);

        return PredictResultDto.builder()
                .amount(Objects.requireNonNull(response.getBody()).predictions().get(0)).build();
    }
}
