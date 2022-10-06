package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.repository.UserRepo;
import com.example.gymbackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    public UserDTO insertUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO,User.class);
        return modelMapper.map(userRepo.save(user), UserDTO.class);
    }


    public String updateUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO,User.class);
        userRepo.save(user);
        return "Updated";
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
