package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Entities.Activity;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Repository.Implementation.ActivityRepositoryImpl;
import com.example.poledigitalacademypda.Repository.Implementation.ManagerRepositoryImpl;
import com.example.poledigitalacademypda.Repository.Specs.ActivityRepository;
import com.example.poledigitalacademypda.Repository.Specs.ManagerRepository;
import jakarta.servlet.http.HttpServletRequest;


import java.util.List;

public class AdminService {
    ActivityRepository activityRepository;
    ManagerRepository managerRepository;

    public AdminService() {
        activityRepository=new ActivityRepositoryImpl();
        managerRepository = new ManagerRepositoryImpl();
    }

    public List<Activity> showAllActivties(){
        return this.activityRepository.findAll();
    }
    public Manager getManager(int id){
        return this.managerRepository.find(id);
    }
    public void addActivity(HttpServletRequest req){
        Activity activity = new Activity();
        activity.setTitle(req.getParameter("title"));
        activity.setDescription(req.getParameter("description"));
        Manager manager = this.getManager(Integer.valueOf(req.getParameter("description")) );
        activity.setManager(manager);
        this.activityRepository.save(activity);
    }
    public void deleteActivity(int id ){
        this.activityRepository.delete(id);
    }


}
