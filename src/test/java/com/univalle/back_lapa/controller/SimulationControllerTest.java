package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.SimulationStartDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimulationControllerTest {

    @Autowired
    private SimulationController controller;

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
        assertThat(this.restTemplate.postForObject(
                "http://localhost:" + port + "/simualtion/start",
                new HttpEntity<>(SimulationStartDto.builder().build()),
                SimulationStartDto.class).toString()).contains("");
    }
}
