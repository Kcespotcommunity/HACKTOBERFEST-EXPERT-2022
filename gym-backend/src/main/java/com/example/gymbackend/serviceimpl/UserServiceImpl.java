package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.customexception.UserNotFoundException;
import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.repository.UserRepo;
import com.example.gymbackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDTO insertUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return Objects.isNull(user) ? null : modelMapper.map(userRepo.save(user), UserDTO.class);
    }

    @Override
    public String updateUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        if (Objects.isNull(user))
            return "Update Failed";
        userRepo.save(user);
        return "Updated";
    }

    @Override
    public UserDTO findUserById(String id) throws Exception {
        Optional<User> user = userRepo.findUserById(id);
        if (user.isPresent())
            return modelMapper.map(user.get(), UserDTO.class);
        else
            throw new UserNotFoundException();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}
