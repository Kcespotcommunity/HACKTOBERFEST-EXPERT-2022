package com.example.gymbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.gymbackend.entity.DietPlan;

public interface DietPlanRepo extends MongoRepository<DietPlan, String> {
}
