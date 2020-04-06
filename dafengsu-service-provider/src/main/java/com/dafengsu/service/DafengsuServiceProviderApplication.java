package com.dafengsu.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.dafengsu.service.mapper")
@EnableDiscoveryClient //启用eureka客户端
@EnableEurekaClient
public class DafengsuServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DafengsuServiceProviderApplication.class, args);
    }

}
