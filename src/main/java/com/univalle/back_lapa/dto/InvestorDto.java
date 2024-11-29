package com.univalle.back_lapa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties
public record InvestorDto(String id,
                          String companyName,
                          @JsonIgnore
                          String productTypeId,
                          @JsonIgnore
                          String assignmentTypeId) {
}
