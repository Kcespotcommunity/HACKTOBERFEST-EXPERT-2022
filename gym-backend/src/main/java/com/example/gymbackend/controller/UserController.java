package com.example.gymbackend.controller;

import com.example.gymbackend.dto.UserDTO;
import com.example.gymbackend.entity.User;
import com.example.gymbackend.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "*") // Always allow @Cors for seemless frontend-backend communication
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ObjectMapper mapper;

    @PostMapping("/add")
    public ResponseEntity<?> insertUser(@RequestBody UserDTO userDTO) {
        ResponseEntity<?> responseEntity = null; // Using Response Entity to Capture Http Status and Response from impl
        UserDTO result = userService.insertUser(userDTO);
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

    @GetMapping(value = "/get-users")
    public ResponseEntity<?> getAllUser() {
        ResponseEntity<?> responseEntity = null;
        List<User> userList = userService.getAllUsers();
        if (CollectionUtils.isEmpty(userList)) {
            responseEntity = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity<>(userList, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PutMapping("/update-user")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO) {
        ResponseEntity<?> responseEntity = null;
        String result = userService.updateUser(userDTO);
        if (result.equals("Updated")) {
            responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>(result, HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }

    @GetMapping("/find-user-by-id/{id}")
    public UserDTO findUserById(@PathVariable String id) {
        try {
            return userService.findUserById(id);
        } catch (Exception exception) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, exception.getMessage());
        }
    }


    @PutMapping("/update-user-status/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable String id){
        try{
            return new ResponseEntity<>(userService.upadteUserStatus(id), HttpStatus.OK);
        }catch (Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/get-user-by-status/{status}")
    public ResponseEntity<?> getUserByStatus(@PathVariable boolean status){
        try{
            return new ResponseEntity<>(userService.getUserByStatus(status), HttpStatus.OK);
        }catch (Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/assign-excercise/{id}/{userId}")
    public ResponseEntity<?> assignExcercise(@PathVariable String id ,@PathVariable String userId ){
        try{
            return new ResponseEntity<>(userService.getUserByStatus(status), HttpStatus.OK);
        }catch (Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
        }

    }


}
