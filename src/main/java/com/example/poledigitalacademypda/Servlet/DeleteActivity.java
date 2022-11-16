package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Services.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "deleteactivity" ,value = "/deleteactivity")
public class DeleteActivity extends HttpServlet {
    AdminService adminService = new AdminService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.adminService.deleteActivity(Integer.valueOf(req.getParameter("id")));
        resp.sendRedirect("/PDA/admin/gestionactivite.jsp");
    }
}
