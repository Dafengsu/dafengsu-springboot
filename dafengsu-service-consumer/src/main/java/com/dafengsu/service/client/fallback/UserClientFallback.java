package com.dafengsu.service.client.fallback;

import com.dafengsu.service.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author su
 * @description
 * @date 2020/4/6
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public String queryById(Long id) {
        return "服务器正忙，请稍后尝试";
    }
}
