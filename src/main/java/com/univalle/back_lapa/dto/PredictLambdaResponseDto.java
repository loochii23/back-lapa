package com.univalle.back_lapa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;


@Builder
@JsonIgnoreProperties
public record PredictLambdaResponseDto(List<Double> predictions) {
}