package com.example.gymbackend.repository;

import com.example.gymbackend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
