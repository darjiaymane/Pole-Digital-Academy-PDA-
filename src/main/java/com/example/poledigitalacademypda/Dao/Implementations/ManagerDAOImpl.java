package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Specs.ManagerDao;
import com.example.poledigitalacademypda.Entities.Manager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class ManagerDAOImpl implements ManagerDao {
    EntityManager entityManager;

    public ManagerDAOImpl() {
        entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public Manager find(int id) {
        return this.entityManager.find(Manager.class,id);

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
