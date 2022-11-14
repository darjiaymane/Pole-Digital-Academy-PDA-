package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Implementation.UserRepositoryImpl;

public class UserService  {
    private UserRepositoryImpl userRepository;

    public UserService() {
    }
    public void addUser(User user){
        this.userRepository.save(user);
    }
}
