package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Dao.Implementations.ManagerDAOImpl;
import com.example.poledigitalacademypda.Dao.Specs.ManagerDao;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Role;
import com.example.poledigitalacademypda.Services.ManagerService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    ManagerService managerService = new ManagerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagerService managerService = new ManagerService();
        List<Manager> managerList;
        managerList = managerService.findAll();
        request.setAttribute("managerList", managerList);
        request.getRequestDispatcher("admin/gestionRespo.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String domaine = request.getParameter("domaine");
        boolean status = Boolean.parseBoolean(request.getParameter("status"));
        String type = request.getParameter("type");

        Manager manager = new Manager();
        manager.setFname(fname);
        manager.setLname(lname);
        manager.setEmail(email);
        manager.setPhone(phone);
        manager.setPassword(password);
        manager.setRole(new Role(role));
        manager.setDomaine(domaine);
        manager.setStatus(status);
        manager.setType(type);

        managerService.save(manager);
        response.sendRedirect(request.getContextPath()+"/AdminServlet");
    }
}
