package com.example.gymbackend.dto;

import com.example.gymbackend.entity.Excercise;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {

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

@Data
class DietPlan {
    @Id
    private String id;
    private List<DietDays> dietDays;
    private String description;
}

@Data
class DietDays {
    private Date date;
    private Date month;
    private Date year;
}
