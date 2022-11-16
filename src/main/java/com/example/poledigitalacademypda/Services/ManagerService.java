package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Dao.Implementations.ManagerDAOImpl;
import com.example.poledigitalacademypda.Dao.Specs.ManagerDao;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class ManagerService {
    private ManagerDao managerDAOImpl = new ManagerDAOImpl();

    public void save(Manager manager) {this.managerDAOImpl.save(manager);}

    public Manager find(int id){
        Manager manager = this.managerDAOImpl.find(id);
        return manager;
    }
    public List<Manager> findAll(){
        List<Manager> managerList;
        managerList = this.managerDAOImpl.findAll();
        return managerList;
    }

    public Manager update(Manager manager){
       return this.managerDAOImpl.update(manager);
    }


}
