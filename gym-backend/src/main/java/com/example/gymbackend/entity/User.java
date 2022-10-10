package com.example.gymbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

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
    private boolean isBlocked;
    public String password;
    private DietPlan dietPlan[];
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
    private Date renewedDate;
    private Date endDate;
}

@Data
class DietPlan {
    @Id
    private String id;
    private DietDays dietDays[];
    private String description;
}

@Data
class DietDays {
    private Date date;
    private Date month;
    private Date year;
}