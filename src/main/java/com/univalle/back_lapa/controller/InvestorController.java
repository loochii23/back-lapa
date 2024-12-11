package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.InvestorDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investor")
public class InvestorController {
    @GetMapping("/investor-list/{productId}/{assignmentTypeId}")
    List<InvestorDto> all(@PathVariable String productId, @PathVariable String assignmentTypeId) {
        List<InvestorDto> investorDtoDtoList = new ArrayList<>();

        investorDtoDtoList.add(InvestorDto.builder()
                .id("03f9f043202e11ee82590ad369ae5ae9")
                .companyName("MINTOS")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("de2e7d79780911ee89d00ad369ae5ae9")
                .companyName("ALMAVEST II 0 a 60")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("de2e7d79780911ee89d00ad369ae5ae9")
                .companyName("ALMAVEST II 0 a 60")
                .productTypeId("2")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("b3454b84202e11ee82590ad369ae5ae9")
                .companyName("BOREALES II")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("6c13d967780711ee89d00ad369ae5ae9")
                .companyName("ALMAVEST I 61 a 180")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("62a43f75202e11ee82590ad369ae5ae9")
                .companyName("ALMAVEST I 0 a 60")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("6c13d967780711ee89d00ad369ae5ae9")
                .companyName("ALMAVEST I 61 a 180")
                .productTypeId("2")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("baaad7b8202e11ee82590ad369ae5ae9")
                .companyName("BOREALES III")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("da8abdaa202e11ee82590ad369ae5ae9")
                .companyName("RODZINA")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("465b9f574df64af8bfc114819e013352")
                .companyName("PERCENT II")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("b3454b84202e11ee82590ad369ae5ae9")
                .companyName("BOREALES II")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("03f9f043202e11ee82590ad369ae5ae9")
                .companyName("MINTOS")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("77a7e91e202e11ee82590ad369ae5ae9")
                .companyName("LENDERMARKET")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("ec4fd848202d11ee82590ad369ae5ae9")
                .companyName("BONDSTER")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("cbd3ecf0202e11ee82590ad369ae5ae9")
                .companyName("TORRE Y MADERO")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("a68632ba202e11ee82590ad369ae5ae9")
                .companyName("BOREALES I")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("1c5a87b3202e11ee82590ad369ae5ae9")
                .companyName("PERCENT")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("ec4fd848202d11ee82590ad369ae5ae9")
                .companyName("BONDSTER")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("8ade01c13c7411ee852c0ad369ae5ae9")
                .companyName("IRIS")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("baaad7b8202e11ee82590ad369ae5ae9")
                .companyName("BOREALES III")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("62a43f75202e11ee82590ad369ae5ae9")
                .companyName("ALMAVEST I 0 a 60")
                .productTypeId("2")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("ec4fd848202d11ee82590ad369ae5ae9")
                .companyName("BONDSTER")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("899746299db740c69caece069a3ad841")
                .companyName("LATAM FINTECH LENDING")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("da8abdaa202e11ee82590ad369ae5ae9")
                .companyName("RODZINA")
                .productTypeId("2")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("a68632ba202e11ee82590ad369ae5ae9")
                .companyName("BOREALES I")
                .productTypeId("1")
                .assignmentTypeId("82c79c039cbf11edab3e16596b766377")
                .build());
        investorDtoDtoList.add(InvestorDto.builder()
                .id("b34d87e689894a9d94bd21fcd600f5b7")
                .companyName("PARRADO INVESTMENT GROUP")
                .productTypeId("1")
                .assignmentTypeId("8cc52cbf9cbf11edab3e16596b766377")
                .build());
        return investorDtoDtoList.stream().filter(investorDto ->
                investorDto.assignmentTypeId().equals(assignmentTypeId) &&
                        investorDto.productTypeId().equals(productId)).toList();
    }
}
