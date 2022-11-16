package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Services.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="updateactivity",value = "/updateactivity")
public class UpdateActivity extends HttpServlet {
    AdminService adminService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        adminService = new AdminService()
        this.adminService.updateActivity(req);
        resp.sendRedirect("../gestionactvite.jsp");
    }
}
