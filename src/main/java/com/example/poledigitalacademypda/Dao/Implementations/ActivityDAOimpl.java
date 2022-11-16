package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Specs.ActivityDao;
import com.example.poledigitalacademypda.Entities.Activity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class ActivityDAOimpl implements ActivityDao {
    private EntityManager entityManager;

    public ActivityDAOimpl() {
        this.entityManager= Persistence.createEntityManagerFactory("default").createEntityManager();

    }

    @Override
    public Activity find(int id) {
        return this.entityManager.find(Activity.class,id);
    }

    @Override
    public List<Activity> findAll() {
        return this.entityManager.createQuery("from Activity ").getResultList();
    }

    @Override
    public void delete(int id) {
    Activity activity = this.find(id);
        System.out.println(activity);
        try{
            this.entityManager.remove(activity);

        }catch (Exception e){
            System.out.println("remove mkhadamach");
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public Activity save(Activity activity) {
        try {
            this.entityManager.persist(activity);
            return activity;
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public Activity update(Activity activity) {
        try {
            System.out.println("abdo");
            System.out.println(activity);

            this.entityManager.merge(activity);
            return activity;
        }catch (Exception e){
            return null;
        }

    }
}
