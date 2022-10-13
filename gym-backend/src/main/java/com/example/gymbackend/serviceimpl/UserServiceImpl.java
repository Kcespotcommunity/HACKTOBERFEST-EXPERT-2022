package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.customexception.UserNotFoundException;
import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.Excercise;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.repository.ExcerciseRepo;
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

    @Autowired
    ExcerciseRepo excerciseRepo;

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

    @Override
    public String upadteUserStatus(String id){
        Optional<User> user = userRepo.findUserById(id);
        if(!user.isPresent())
            return "User not found";
        if(user.get().getActive())
         user.get().setActive(false);
        else user.get().setActive(true);
        userRepo.save(user.get());
        return "updated";
    }

    @Override
    public List<User> getUserByStatus(boolean status){
        return userRepo.findAllByActive(status);
    }

   public String assignExcercise(String id,String userId){
       Optional<Excercise> excercise = excerciseRepo.findById(id);
       Optional<User> user = userRepo.findUserById(id);
       user.get().getExcercise().add(excercise.get());
       userRepo.save(user.get());
       return "added";
    }

}
