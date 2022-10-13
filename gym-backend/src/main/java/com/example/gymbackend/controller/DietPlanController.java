package com.example.gymbackend.controller;

import com.example.gymbackend.dto.DietPlanDTO;
import com.example.gymbackend.entity.DietPlan;
import com.example.gymbackend.service.DietPlanService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/diet-plan")
public class DietPlanController {

    @Autowired
    DietPlanService dietPlanService;

    @Autowired
    ObjectMapper mapper;

    @PostMapping("/add")
    public ResponseEntity<?> insertDietPlan(@RequestBody DietPlanDTO dietPlanDTO) {
        ResponseEntity<?> responseEntity = null;
        DietPlanDTO result = dietPlanService.insertDietPlan(dietPlanDTO);
        try {
            if (Objects.isNull(result)) {
                responseEntity = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            } else {
                responseEntity = new ResponseEntity<>(mapper.writeValueAsString(result), HttpStatus.OK);
            }
        } catch (JsonProcessingException e) {
            responseEntity = new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
        return responseEntity;
    }

    @GetMapping(value = "/get-dietPlans")
    public ResponseEntity<?> getAllDietPlan() {
        ResponseEntity<?> responseEntity = null;
        List<DietPlan> dietPlansList = dietPlanService.getAllDietPlans();
        if (CollectionUtils.isEmpty(dietPlansList)) {
            responseEntity = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity<>(dietPlansList, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PutMapping("/update-dietPlans")
    public ResponseEntity<?> updateDiet(@RequestBody DietPlanDTO dietPlanDTO) {
        ResponseEntity<?> responseEntity = null;
        String result = dietPlanService.updateDietPlan(dietPlanDTO);
        if (result.equals("Updated")) {
            responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>(result, HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }

}
