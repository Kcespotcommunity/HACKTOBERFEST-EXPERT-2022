package com.example.gymbackend.repository;

import com.example.gymbackend.entity.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<Admin,String> {
}
