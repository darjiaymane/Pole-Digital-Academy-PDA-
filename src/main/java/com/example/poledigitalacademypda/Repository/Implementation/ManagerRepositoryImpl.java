package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Implementations.ManagerDAOImpl;
import com.example.poledigitalacademypda.Dao.Specs.ManagerDao;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Repository.Specs.ManagerRepository;

import java.util.List;

public class ManagerRepositoryImpl implements ManagerRepository {
    ManagerDao managerDao ;

    public ManagerRepositoryImpl() {
        managerDao = new ManagerDAOImpl();
    }

    @Override
    public Manager find(int id) {
        return this.managerDao.find(id);
    }

    @Override
    public List<Manager> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Manager save(Manager manager) {
        return null;
    }

    @Override
    public Manager update(Manager manager) {
        return null;
    }
}
