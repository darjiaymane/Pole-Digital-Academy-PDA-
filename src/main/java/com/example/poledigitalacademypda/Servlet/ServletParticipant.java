package com.example.poledigitalacademypda.Servlet;

import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Participant;
import com.example.poledigitalacademypda.Services.ManagerService;
import com.example.poledigitalacademypda.Services.ParticipantServie;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletParticipant", value = "/ServletParticipant")
public class ServletParticipant extends HttpServlet {
    ParticipantServie participantServie = new ParticipantServie();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ParticipantServie participantServie = new ParticipantServie();
        List<Participant> participantList;
        participantList = participantServie.findAll();
        request.setAttribute("participantList", participantList);
        request.getRequestDispatcher("participant/participant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
