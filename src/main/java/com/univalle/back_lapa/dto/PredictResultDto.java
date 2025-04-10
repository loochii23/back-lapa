package com.univalle.back_lapa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;


@Builder
@JsonIgnoreProperties
public record PredictResultDto(Double amount) {
}