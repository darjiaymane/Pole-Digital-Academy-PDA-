package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Specs.ManagerDao;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
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
        List<Manager> managerList = this.entityManager.createQuery("SELECT m FROM Manager m", Manager.class).getResultList();
        return managerList;
    }

    @Override
    public void delete(int id) {
    }
    @Override
    public Manager save(Manager manager){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(manager);
        this.entityManager.getTransaction().commit();
        return manager;
    }

    @Override
    public Manager update(Manager manager) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(manager);
        this.entityManager.getTransaction().commit();
        return manager;
    }
}
