package com.example.gymbackend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("excecise")
public class Excercise {
    @Id
    private String id;
    private String name;
    private int reps;
    private int count;
    private String description;
}
