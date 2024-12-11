package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.ProductTypeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductTypeController {
    @GetMapping("/product-type-list")
    List<ProductTypeDto> all() {
        List<ProductTypeDto> productTypeDtoList = new ArrayList<>();

        productTypeDtoList.add(ProductTypeDto.builder()
                .id("2")
                .name("RAPIPLAZO")
                .code("RP")
                .build());
        productTypeDtoList.add(ProductTypeDto.builder()
                .id("1")
                .name("RAPIFLEX")
                .code("RF")
                .build());
        return productTypeDtoList;
    }
}
