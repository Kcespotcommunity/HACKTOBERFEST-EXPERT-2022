package com.example.gymbackend.controller;

import com.example.gymbackend.dto.AdminDTO;
import com.example.gymbackend.dto.DietPlanDTO;
import com.example.gymbackend.entity.Admin;
import com.example.gymbackend.entity.DietPlan;
import com.example.gymbackend.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    ObjectMapper mapper;

    @PostMapping("/add")
    public ResponseEntity<?> insertAdmin(@RequestBody AdminDTO adminDTO) {
        ResponseEntity<?> responseEntity = null;
        AdminDTO result = adminService.insertAdmin(adminDTO);
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

    @GetMapping(value = "/get-admin")
    public ResponseEntity<?> getAllAdmins() {
        ResponseEntity<?> responseEntity = null;
        List<Admin> admins = adminService.getAllAdmins();
        if (CollectionUtils.isEmpty(admins)) {
            responseEntity = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity<>(admins, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PutMapping("/update-admin")
    public ResponseEntity<?> updateAdmin(@RequestBody AdminDTO adminDTO) {
        ResponseEntity<?> responseEntity = null;
        String result = adminService.updateAdmin(adminDTO);
        if (result.equals("Updated")) {
            responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>(result, HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }

    @DeleteMapping("/delete-admin")
    public ResponseEntity<?> deleteAdmin(@RequestBody AdminDTO adminDTO) {
        ResponseEntity<?> responseEntity = null;
        String result = adminService.deleteAdmin(adminDTO);
        if (result.equals("Deleted")) {
            responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>(result, HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }


}
