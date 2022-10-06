package com.example.gymbackend.customexception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("User with this id not found");
    }
}
