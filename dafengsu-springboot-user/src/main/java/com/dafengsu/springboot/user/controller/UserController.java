package com.dafengsu.springboot.user.controller;

import com.dafengsu.springboot.user.pojo.User;
import com.dafengsu.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author su
 * @description
 * @date 2020/4/4
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id) {
        return this.userService.queryUserById(id);
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello,User!";
    }
    @GetMapping("all")
    public String toUsers(Model model) {
        List<User> users = userService.queryUserAll();
        model.addAttribute("users", users);
        return "users";
    }
}
