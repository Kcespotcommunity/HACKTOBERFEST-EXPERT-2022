package com.example.gymbackend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Document("dietPlan")
public class DietPlan {
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
