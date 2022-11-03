package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Dao;
import com.example.poledigitalacademypda.Dao.Specs.UserDao;
import com.example.poledigitalacademypda.Entities.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.service.ServiceRegistry;

public class UserDAOImpl implements UserDao {
    private SessionFactory sessionFactory;
    public UserDAOImpl() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        this.sessionFactory = sessionFactory;
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
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
        if(session.getTransaction().getStatus()== TransactionStatus.COMMITTED){
            session.close();
            return user;
        }else{
            session.close();
            session.getTransaction().rollback();
            session.close();
            throw new HibernateException("Transaction was not committed");
        }
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public SessionFactory exportSessionFactory() {
        return this.sessionFactory;
    }

}
