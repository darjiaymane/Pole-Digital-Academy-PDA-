package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Dao;
import com.example.poledigitalacademypda.Dao.Implementations.UserDAOImpl;
import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Specs.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private UserDAOImpl userDAOImpl;
    private EntityManager entityManager;

    public UserRepositoryImpl() {
        this.userDAOImpl = new UserDAOImpl();
        this.entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public User find(int id) {
        return null;
    }
    public User findByEmail(String email) {
        return (User) this.entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email").setParameter("email",email).getSingleResult();
    }
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public User save(User user) {
        return this.userDAOImpl.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }


}
