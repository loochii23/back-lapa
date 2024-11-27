package com.univalle.back_lapa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product-list")
    String all() {
        return "lista de productos";
    }
}
