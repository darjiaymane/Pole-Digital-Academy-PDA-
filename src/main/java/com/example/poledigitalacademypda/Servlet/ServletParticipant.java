package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Participant;
import com.example.poledigitalacademypda.Entities.Role;
import com.example.poledigitalacademypda.Services.ManagerService;
import com.example.poledigitalacademypda.Services.ParticipantServie;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletParticipant", urlPatterns ={ "/addparticipant","/updateparticipant","/ServletParticipant"})
public class ServletParticipant extends HttpServlet {
    ParticipantServie participantServie = new ParticipantServie();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path) {
            case "/ServletParticipant":
                ParticipantServie participantServie = new ParticipantServie();
                List<Participant> participantList;
                participantList = participantServie.findAll();
                request.setAttribute("participantList", participantList);
                request.getRequestDispatcher("participant/participant.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path) {
            case "/addparticipant":

                String domaine = request.getParameter("domaine");
                String email = request.getParameter("email");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String password = request.getParameter("password");
                String phone = request.getParameter("phone");
                boolean status = Boolean.parseBoolean(request.getParameter("status"));
                String role = request.getParameter("role");
                String structure = request.getParameter("structure");

                Participant participant = new Participant();
                participant.setFname(fname);
                participant.setLname(lname);
                participant.setEmail(email);
                participant.setPhone(phone);
                participant.setPassword(password);
                participant.setRole(new Role(role));
                participant.setDomaine(domaine);
                participant.setStatus(status);
                participant.setStructure(structure);
                participantServie.save(participant);
                response.sendRedirect(request.getContextPath() + "/ServletParticipant");

                break;
            case "/updateparticipant":
                int id = Integer.parseInt(request.getParameter("id"));
                String Domaine = request.getParameter("domaine");
                String Email = request.getParameter("email");
                String Fname = request.getParameter("fname");
                String Lname = request.getParameter("lname");
                String Phone = request.getParameter("phone");
                boolean Status = Boolean.parseBoolean(request.getParameter("status"));
                String Role = request.getParameter("role");
                String Structure = request.getParameter("structure");


                Participant Participant = participantServie.find(id);
                Participant.setFname(Fname);
                Participant.setLname(Lname);
                Participant.setEmail(Email);
                Participant.setPhone(Phone);
                Participant.setRole(new Role(Role));
                Participant.setDomaine(Domaine);
                Participant.setStatus(Status);
                Participant.setStructure(Structure);
                participantServie.save(Participant);
                response.sendRedirect(request.getContextPath() + "/ServletParticipant");


                break;
        }
    }
}
