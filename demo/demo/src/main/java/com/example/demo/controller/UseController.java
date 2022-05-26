package com.example.demo.controller;

import com.example.demo.entity.UserEntity;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UseController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    @ResponseBody
    public List<UserEntity>getUserList(){
        List<UserEntity> userEntities = userService.queryList();
        return userEntities;
    }

    @PostMapping("addOrUpdate")
    @ResponseBody
    public UserEntity addOrUpdate(@RequestBody UserEntity user) {
        userService.addOrUpdateUser(user);
        return user;
    }
}
