package com.dafengsu.service.controller;

import com.dafengsu.service.pojo.User;
import com.dafengsu.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author su
 * @description
 * @date 2020/4/5
 */
@RestController
@RequestMapping("provider/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id) {
        return this.userService.queryUserById(id);
    }
}
