package com.example.gymbackend.repository;

import com.example.gymbackend.entity.Excercise;
import com.example.gymbackend.entity.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExcerciseRepo extends MongoRepository<Excercise,String> {

}
