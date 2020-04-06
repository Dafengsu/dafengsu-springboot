package com.dafengsu.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;

/**
 * @author su
 * @description
 * @date 2020/4/6
 */
@SpringBootTest
class RibbonLoadBalanceTest {
    @Autowired
    private RibbonLoadBalancerClient client;
    @Test
    void test() {
        for (int i = 0; i < 50; i++) {
            ServiceInstance instance = this.client.choose("service-provider");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
        System.out.println("测试完成");
    }
}
