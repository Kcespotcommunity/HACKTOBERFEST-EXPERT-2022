package com.example.gymbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document("user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private Address address;
    private String mobileNo;
    private Plan plan;
    private boolean active;
    public String password;
    private List<DietPlan> dietPlan;
    private List<Excercise> excercise;
}

@Data
class Address {
    private String doorNo;
    private String streetName;
    private String city;
    private String pincode;
    private String state;
    private String country;
}

@Data
class Plan {
    private String durationInMonths;
    private Date startDate;
    private Date endDate;
}



