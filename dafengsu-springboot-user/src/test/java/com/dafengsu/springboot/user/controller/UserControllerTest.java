package com.dafengsu.springboot.user.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * @author su
 * @description
 * @date 2020/4/4
 */
@SpringBootTest(webEnvironment = RANDOM_PORT)
class UserControllerTest {

    @Test
    void queryUserById(@Autowired WebTestClient client) {
        client.get().uri("/user/test").exchange().expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello,User!");
    }

    @Test
    void exampleTest(@Autowired TestRestTemplate restTemplate) {
        String body = restTemplate.getForObject("/user/test", String.class);
        assertEquals(body,"Hello,User!");
    }
}
