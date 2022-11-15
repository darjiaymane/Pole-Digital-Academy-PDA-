package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Implementation.UserRepositoryImpl;

import java.util.Arrays;

public class UserService  {
    private UserRepositoryImpl userRepository;

    public UserService() {
        this.userRepository = new UserRepositoryImpl();
    }
    public void addUser(User user){
        this.userRepository.save(user);
    }
    public User login(User user) throws Exception{
        try{
            User user1 = this.userRepository.findByEmail(user.getEmail());
            System.out.println(user1);
            if(user1.getPassword().equals(user.getPassword())){
                return user1;
            }

        }catch (Exception e){
            System.out.println("Login Fih moshkil");
        }
        return null;

        }

}
