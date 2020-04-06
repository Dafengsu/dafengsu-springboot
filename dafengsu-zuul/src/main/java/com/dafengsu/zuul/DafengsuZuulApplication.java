package com.dafengsu.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DafengsuZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DafengsuZuulApplication.class, args);
    }

}
