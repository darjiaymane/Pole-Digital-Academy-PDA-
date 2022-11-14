package com.example.poledigitalacademypda.Dump;

import com.example.poledigitalacademypda.Entities.Role;
import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Services.UserService;

public class TestPersistence {
    public static void main(String[] args ){
        UserService userService = new UserService();
        User u1= new User("1","1","dsks","ds","ddf",null);
        userService.addUser(u1);
    }

}
