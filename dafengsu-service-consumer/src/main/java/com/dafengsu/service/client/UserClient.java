package com.dafengsu.service.client;

import com.dafengsu.service.client.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author su
 * @description
 * @date 2020/4/6
 */
@FeignClient(value = "service-provider",fallback = UserClientFallback.class)
public interface UserClient {
    @RequestMapping("provider/user/{id}")
    String queryById(@PathVariable("id") Long id);
}
