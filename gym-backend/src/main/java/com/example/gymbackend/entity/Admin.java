package com.example.gymbackend.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("admin")
public class Admin {

    @Id
    private String id;
    private String userName;
    private String email;
    private String password;

}
