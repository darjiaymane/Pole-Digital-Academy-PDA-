package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Implementations.UserDAOImpl;
import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Specs.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private UserDAOImpl userDAOImpl;

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
        return this.userDAOImpl.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }


}
