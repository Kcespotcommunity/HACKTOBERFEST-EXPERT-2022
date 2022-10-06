package com.example.gymbackend.repository;

import com.example.gymbackend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User,String> {

    Optional<User> findUserById(String id);

}
