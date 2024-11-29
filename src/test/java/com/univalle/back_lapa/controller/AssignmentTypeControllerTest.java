package com.univalle.back_lapa.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AssignmentTypeControllerTest {

    @Autowired
    private AssignmentTypeController controller;

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
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/assignment-type-list",
                String.class)).contains("[{\"id\":\"82c79c039cbf11edab3e16596b766377\",\"description\":\"COMPRA DE CARTERA\"},{\"id\":\"8cc52cbf9cbf11edab3e16596b766377\",\"description\":\"GARANTÍA DE MUTUO\"}]");
    }
}
