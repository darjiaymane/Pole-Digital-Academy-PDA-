package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Entities.Activity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "addactivity",value = "/addactivity")
public class AddActivity extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Activity activity = new Activity();
//        activity.setTitle(req.getParameter("title"));
//        activity.setDescription(req.getParameter("description"));
//        activity.setManager();

    }
}
