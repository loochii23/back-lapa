package com.univalle.back_lapa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;


@Builder
@JsonIgnoreProperties
public record SimulationStartDto(List<InvestorSaveDto> investors,
                                 String date,
                                 String assignmentTypeId,
                                 String productTypeId) {
}
