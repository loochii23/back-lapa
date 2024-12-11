package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.AssignmentTypeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/assignment-type")
public class AssignmentTypeController {
    @GetMapping("/assignment-type-list/{productId}")
    List<AssignmentTypeDto> all() {
        List<AssignmentTypeDto> assignmentTypeDtoList = new ArrayList<>();
        assignmentTypeDtoList.add(AssignmentTypeDto.builder()
                .id("82c79c039cbf11edab3e16596b766377")
                .description("COMPRA DE CARTERA")
                .build());
        assignmentTypeDtoList.add(AssignmentTypeDto.builder()
                .id("8cc52cbf9cbf11edab3e16596b766377")
                .description("GARANTÍA DE MUTUO")
                .build());
        return assignmentTypeDtoList;
    }
}
