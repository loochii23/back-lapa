package com.univalle.back_lapa.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductTypeControllerTest {

    @Autowired
    private ProductTypeController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    void greetingShouldReturnDefaultMessage() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/product/product-type-list",
                String.class)).contains("[{\"id\":\"2\",\"name\":\"RAPIPLAZO\",\"code\":\"RP\"},{\"id\":\"1\",\"name\":\"RAPIFLEX\",\"code\":\"RF\"}]");
    }
}
