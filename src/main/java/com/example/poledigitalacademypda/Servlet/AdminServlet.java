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

@WebServlet(name = "AdminServlet", urlPatterns ={"/addManager", "/updateManager","/AdminServlet"})
public class AdminServlet extends HttpServlet {
    ManagerService managerService = new ManagerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path){
            case "/AdminServlet":
                ManagerService managerService = new ManagerService();
                List<Manager> managerList;
                managerList = managerService.findAll();
                request.setAttribute("managerList", managerList);
                request.getRequestDispatcher("admin/gestionRespo.jsp").forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path){
            case "/addManager":
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
                break;
            case "/updateManager":
                System.out.println("--------------"+request.getParameter("fname"));
                int id = Integer.parseInt(request.getParameter("id"));
                String _fname = request.getParameter("fname");
                String _lname = request.getParameter("lname");
                String _email = request.getParameter("email");
                String _phone = request.getParameter("phone");
                String _password = request.getParameter("password");
                String _role = request.getParameter("role");
                String _domaine = request.getParameter("domaine");
                boolean _status = Boolean.parseBoolean(request.getParameter("status"));
                String _type = request.getParameter("type");

                Manager _manager = managerService.find(id);
                _manager.setFname(_fname);
                _manager.setLname(_lname);
                _manager.setEmail(_email);
                _manager.setPhone(_phone);
                _manager.setPassword(_password);
                _manager.setRole(new Role(_role));
                _manager.setDomaine(_domaine);
                _manager.setStatus(_status);
                _manager.setType(_type);

                managerService.update(_manager);
                response.sendRedirect(request.getContextPath()+"/AdminServlet");

        }

    }
}
