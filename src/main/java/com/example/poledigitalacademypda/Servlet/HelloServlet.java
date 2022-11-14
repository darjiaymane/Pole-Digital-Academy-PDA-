package com.example.poledigitalacademypda.Servlet;

import java.io.*;

import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Services.UserService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private UserService userService;

    public void init() {
        message = "Hello World!";
        this.userService = new UserService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        User user = new User("ibrahim","esseddyq","email","07","pass",null);
//        this.userService.addUser(user);
        System.out.println(System. getProperty("java.version"));

    }

    public void destroy() {
    }
}
