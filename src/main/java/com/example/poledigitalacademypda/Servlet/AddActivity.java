package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Entities.Activity;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Services.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "addactivity",value = "/addactivity")
public class AddActivity extends HttpServlet {
    AdminService adminService= new AdminService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path){
            case "/AdminServlet":
                request.getRequestDispatcher("admin/gestionRespo.jsp").forward(request,response);
                break;
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Activity activity = new Activity();
        activity.setTitle(req.getParameter("title"));
        activity.setDescription(req.getParameter("description"));
//        activity.setManager();

        this.adminService.addActivity(req);
        resp.sendRedirect("../gestionactvite.jsp");

    }
}
