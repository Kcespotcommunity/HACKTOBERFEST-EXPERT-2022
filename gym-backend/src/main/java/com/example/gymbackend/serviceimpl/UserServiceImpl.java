package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.repository.UserRepo;
import com.example.gymbackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    public UserDTO insertUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return Objects.isNull(user) ? null : modelMapper.map(userRepo.save(user), UserDTO.class);
    }


    public String updateUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        if (Objects.isNull(user))
            return "Update Failed";
        userRepo.save(user);
        return "Updated";
    }

    public List<User> getAllUsers() {
        return CollectionUtils.isEmpty(userRepo.findAll()) ? null : userRepo.findAll();
    }

}
