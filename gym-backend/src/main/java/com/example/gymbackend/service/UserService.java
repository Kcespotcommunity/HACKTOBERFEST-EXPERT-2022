package com.example.gymbackend.service;

import com.example.gymbackend.entity.User;

import java.util.List;

public interface UserService {

    User insertUser(User user);
    List<User> getAllUsers();


}
