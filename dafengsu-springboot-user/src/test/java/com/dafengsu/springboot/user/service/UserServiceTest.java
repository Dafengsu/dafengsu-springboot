package com.dafengsu.springboot.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author su
 * @description
 * @date 2020/4/4
 */
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void queryUserById() {
        System.out.println(userService.queryUserById(16L));
    }
}
