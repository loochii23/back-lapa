package com.univalle.back_lapa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;


@Builder
@JsonIgnoreProperties
public record PredictResultDto(Double amount,
                               Double balanceAmount,
                               List<InvestorDto> investorList,
                               Integer count,
                               Integer balanceCount) {
}