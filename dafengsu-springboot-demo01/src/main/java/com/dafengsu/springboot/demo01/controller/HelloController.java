package com.dafengsu.springboot.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author su
 * @description
 * @date 2020/4/3
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/show")
    public String home() {
        return "Hello,Word";
    }


}
