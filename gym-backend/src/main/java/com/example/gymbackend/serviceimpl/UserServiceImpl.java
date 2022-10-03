package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.entity.User;
import com.example.gymbackend.repository.UserRepo;
import com.example.gymbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    public User insertUser(User user){
        return userRepo.save(user);
    }
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
