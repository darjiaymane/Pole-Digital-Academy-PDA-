package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Entities.Activity;
import com.example.poledigitalacademypda.Repository.Implementation.ActivityRepositoryImpl;
import com.example.poledigitalacademypda.Repository.Specs.ActivityRepository;

import java.util.List;

public class AdminService {
    ActivityRepository activityRepository;

    public AdminService() {
        activityRepository=new ActivityRepositoryImpl();
    }

    public List<Activity> showAllActivties(){
        return this.activityRepository.findAll();
    }

}
