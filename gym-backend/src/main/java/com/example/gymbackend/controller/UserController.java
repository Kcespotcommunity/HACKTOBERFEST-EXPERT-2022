package com.example.gymbackend.controller;

import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public UserDTO insertUser(@RequestBody UserDTO userDTO){
        return userService.insertUser(userDTO);
    }

    @GetMapping(value = "/get-users")
    public List<User> getAllUser(){
       return userService.getAllUsers();
    }

    @PutMapping("/update-user")
    public String updateUser(@RequestBody UserDTO userDTO){
       return userService.updateUser(userDTO);
    }

}
