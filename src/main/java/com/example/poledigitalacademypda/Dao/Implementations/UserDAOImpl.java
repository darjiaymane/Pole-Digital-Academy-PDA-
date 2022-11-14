package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Dao;
import com.example.poledigitalacademypda.Dao.Specs.UserDao;
import com.example.poledigitalacademypda.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.service.ServiceRegistry;

public class UserDAOImpl implements UserDao {
    private EntityManager entityManager;
    public UserDAOImpl() {
        this.entityManager= Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public User[] findAll() {
        return new User[0];
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User save(User user) {

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }



    public SessionFactory exportEntityManager() {
        return this.exportEntityManager();
    }
}
