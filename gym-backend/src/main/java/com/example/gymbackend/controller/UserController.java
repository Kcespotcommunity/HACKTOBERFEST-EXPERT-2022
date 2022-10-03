package com.example.gymbackend.controller;

import com.example.gymbackend.entity.User;
import com.example.gymbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @GetMapping(value = "/get-users")
    public List<User> getAllUser(){
       return userService.getAllUsers();
    }

}
