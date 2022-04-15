package com.cydeo.spring08springmvcmodelpractice2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloWorldApplicationTest {

    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    public class CheckHTTPResponse {
        @LocalServerPort
        private int port;

        @Autowired
        private TestRestTemplate restTemplate;

        @Test
        public void shouldPassIfStringMatches() throws Exception {
            assertThat(restTemplate.getForObject("http://localhost:" + port + "/",
                    String.class)).contains("Hello World from Spring Boot");
        }
    }

    // to run the test: Ctrl+R (macOS), or Shift+F10 (Windows/Linux)


}
