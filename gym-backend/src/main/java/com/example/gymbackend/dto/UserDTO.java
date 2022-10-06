package com.example.gymbackend.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserDTO {
    private String id;
    private String name;
    private int age;
    private String mobileNo;
    private boolean isBlocked;

}

@Data
class Address{
    private String doorNo;
    private String streetName;
    private String city;
    private String pincode;
    private String state;
    private String country;
}

@Data
class Plan{
    private String durationInMonths;
    private Date renewedDate;
    private Date endDate;
}

