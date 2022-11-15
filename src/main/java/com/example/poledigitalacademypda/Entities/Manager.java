package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager extends User{
    @Column
    private String type;
    @OneToMany
    private List<Activity> activityList;
}
