package com.univalle.back_lapa.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InvestorControllerTest {

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
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/investor/investor-list/2/82c79c039cbf11edab3e16596b766377",
                String.class)).contains("[{\"id\":\"03f9f043202e11ee82590ad369ae5ae9\",\"companyName\":\"MINTOS\"},{\"id\":\"b3454b84202e11ee82590ad369ae5ae9\",\"companyName\":\"BOREALES II\"},{\"id\":\"a68632ba202e11ee82590ad369ae5ae9\",\"companyName\":\"BOREALES I\"},{\"id\":\"ec4fd848202d11ee82590ad369ae5ae9\",\"companyName\":\"BONDSTER\"},{\"id\":\"baaad7b8202e11ee82590ad369ae5ae9\",\"companyName\":\"BOREALES III\"},{\"id\":\"da8abdaa202e11ee82590ad369ae5ae9\",\"companyName\":\"RODZINA\"}]");
    }

    @Test
    void greetingShouldReturnEmptyMessage() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/investor/investor-list/3/82c89c039cbf11edab3e16596b766377",
                String.class)).contains("[]");
    }
}
