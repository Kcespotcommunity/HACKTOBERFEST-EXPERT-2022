package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.dto.DietPlanDTO;
import com.example.gymbackend.entity.DietPlan;
import com.example.gymbackend.repository.DietPlanRepo;
import com.example.gymbackend.service.DietPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

public class DietPlanServiceImpl implements DietPlanService {

    @Autowired
    DietPlanRepo dietPlanRepo;

    @Autowired
    ModelMapper modelMapper;

    public DietPlanDTO insertDietPlan(DietPlanDTO dietPlanDTO) {
        DietPlan dietPlan = modelMapper.map(dietPlanDTO, DietPlan.class);
        return Objects.isNull(dietPlan) ? null : modelMapper.map(dietPlanRepo.save(dietPlan), DietPlanDTO.class);
    }

    public String updateDietPlan(DietPlanDTO dietPlanDTO) {
        DietPlan dietPlan = modelMapper.map(dietPlanDTO, DietPlan.class);
        if (Objects.isNull(dietPlan))
            return "Update Failed";
        dietPlanRepo.save(dietPlan);
        return "Updated";
    }

    public List<DietPlan> getAllDietPlans() {
        return CollectionUtils.isEmpty(dietPlanRepo.findAll()) ? null : dietPlanRepo.findAll();
    }


}
