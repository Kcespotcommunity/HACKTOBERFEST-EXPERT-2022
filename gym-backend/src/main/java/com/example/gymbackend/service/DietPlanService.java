package com.example.gymbackend.service;

import com.example.gymbackend.dto.DietPlanDTO;
import com.example.gymbackend.entity.DietPlan;

import java.util.List;

public interface DietPlanService {

    public DietPlanDTO insertDietPlan(DietPlanDTO dietPlanDTO);
    public String updateDietPlan(DietPlanDTO dietPlanDTO);
    public List<DietPlan> getAllDietPlans();

}
