package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Entities.User;
import com.example.poledigitalacademypda.Repository.Implementation.UserRepositoryImpl;
import com.example.poledigitalacademypda.Repository.Specs.UserRepository;
import com.example.poledigitalacademypda.Services.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login" , value = "/login")
public class LoginServlet extends HttpServlet {
    private UserService userService;
    private int count = 0;

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.userService = new UserService();
        User user_in = new User();
        user_in.setEmail(req.getParameter("email"));
        user_in.setPassword(req.getParameter("password"));
        PrintWriter out = resp.getWriter();

        try {
            User user_out = this.userService.login(user_in);
            System.out.println(user_out);
            if(user_out != null){
                out.println("congrats");
            }
            else {
                out.println("dmmg");

            }
            HttpSession session = req.getSession();
            session.setAttribute("email",user_out.getEmail());
            session.setAttribute("lastname",user_out.getLname());
            session.setAttribute("firstname",user_out.getFname());
            session.setAttribute("id",user_out.getId());
            session.setAttribute("role",user_out.getRole());
            System.out.println(user_out);
            switch (user_out.getRole().getName()){
                case "candidate":
                    req.getRequestDispatcher("/candidate.jsp").forward(req,resp);
                    break;
                case "manager":
                    req.getRequestDispatcher("/manager.jsp").forward(req,resp);

                    break;
                case "admin":
                    req.getRequestDispatcher("/admin.jsp").forward(req,resp);

                    break;
            }



        } catch (Exception e) {
            System.out.println("moshkil f login");
        }

    }
}
