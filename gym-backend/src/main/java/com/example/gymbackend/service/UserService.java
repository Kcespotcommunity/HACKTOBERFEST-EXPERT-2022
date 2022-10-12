package com.example.gymbackend.service;

import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;

import java.util.List;

public interface UserService {

    UserDTO insertUser(UserDTO userDTO);
    String updateUser(UserDTO userDTO);
    List<User> getAllUsers();


}
