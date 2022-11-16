package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Dao;
import com.example.poledigitalacademypda.Dao.Implementations.UserDAOImpl;
import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Specs.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
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
        System.out.println(email);
        try {
            Query q = this.entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");
            System.out.println(this.entityManager.createQuery("SELECT u FROM User u ").getResultList());
            q.setParameter("email",email);
            System.out.println(q.getResultList());
            return (User) q.getResultList().get(0);

        }catch (Exception e){
            System.out.println("Kayn mochkil f repo");
            System.out.println(e.getCause());

            return null;
        }
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
