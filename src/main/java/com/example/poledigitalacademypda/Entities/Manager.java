package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager extends User implements Serializable {
    @Column
    private String type;
    @OneToMany
    private List<Activity> activityList;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String toString() {

        return "Manager{" +super.toString()+
                "type='" + type + '\'' +
                '}';
    }
}
