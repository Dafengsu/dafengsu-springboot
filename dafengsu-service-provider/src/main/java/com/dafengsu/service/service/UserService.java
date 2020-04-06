package com.dafengsu.service.service;

import com.dafengsu.service.mapper.UserMapper;
import com.dafengsu.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author su
 * @description
 * @date 2020/4/5
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id) {
       return userMapper.selectByPrimaryKey(id);
    }
}
