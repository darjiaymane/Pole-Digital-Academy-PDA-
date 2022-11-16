
package com.example.poledigitalacademypda.Dao.Implementations;
import com.example.poledigitalacademypda.Dao.Dao;
import com.example.poledigitalacademypda.Dao.Specs.UserDao;
import com.example.poledigitalacademypda.Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDao {
    private EntityManager entityManager;

    public UserDAOImpl() {
        this.entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public User find(int id) {
        return null;
    }
//    public User find(String username) {
//        entityManager.createQuery("")
//    }


    @Override
    public List<User> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(int id) {

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


}