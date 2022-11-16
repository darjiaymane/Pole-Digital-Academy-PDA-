package com.example.poledigitalacademypda.Dump;

import com.example.poledigitalacademypda.Dao.Implementations.UserDAOImpl;
import com.example.poledigitalacademypda.Dao.Specs.UserDao;
import com.example.poledigitalacademypda.Entities.Role;
import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Implementation.UserRepositoryImpl;
import com.example.poledigitalacademypda.Repository.Specs.UserRepository;
import com.example.poledigitalacademypda.Services.UserService;

public class TestPersistence {
    public static void main(String[] args ){
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        Role role1 = new Role("admin");
        Role role2 = new Role("manager");
        User user = new User("ibrahim","esseddyq","ibrahim@gmail.com","29e38","1234",role1);
        User user2 = new User("jamal","rouj","bbb","29e38","hakawa",role2);
        User user3 = new User("anass","jablah","anas@gmail.com","29e38","wattt",role2);

        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
        System.out.println(userRepository.findByEmail("ibrahim@gmail.com"));
    }

}
