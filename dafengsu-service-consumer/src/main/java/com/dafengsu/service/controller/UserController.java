package com.dafengsu.service.controller;

import com.dafengsu.service.client.UserClient;
import com.dafengsu.service.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/4/5
 */
@RestController
@RequestMapping("consumer/user")
//@DefaultProperties(defaultFallback = "fallbackMethod")
public class UserController {
    /*
        @Autowired
        private RestTemplate restTemplate;
    */
    @Autowired
    private UserClient userClient;
    //    @Autowired
//    private DiscoveryClient discoveryClient;
    @RequestMapping("{id}")
/*    @ResponseBody
    @HystrixCommand*/
    public String queryById(@PathVariable("id") Long id) {
//        ServiceInstance instance = discoveryClient.
//                getInstances("service-provider").get(0);
      /*  if (id == 1) {
            throw new RuntimeException();
        }
        return restTemplate.getForObject("http://service-provider/provider/user/" + id, String.class);*/
        return this.userClient.queryById(id);
    }

/*    public String fallbackMethod() {
        return "服务器正忙，请稍后再试";
    }*/
}
