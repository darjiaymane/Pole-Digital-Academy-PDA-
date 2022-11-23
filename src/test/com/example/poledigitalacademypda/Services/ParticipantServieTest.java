package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Entities.Participant;
import com.example.poledigitalacademypda.Entities.Role;
import org.hibernate.type.TrueFalseConverter;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ParticipantServieTest {
    ParticipantServie participantServie ;


    @BeforeAll
    void beforeAllTest(){
        participantServie = new ParticipantServie();
    }



    @Test
    @DisplayName("")
    void checkFindAllReturnListOfParticipant() {
        List<Participant> list =participantServie.findAll();
        Assertions.assertTrue(list.size()>0);
    }
    @Test
    public void checkIfParticipantInsertToDataBase(){

        String domaine = "IT";
        String email = "Ahmed@gmail.com";
        String fname = "Ahmed";
        String lname = "Ahmed";
        String password = "34526";
        String phone = "0623146578";
        boolean status = false;
        String role = "Admin";
        String structure = "YouCodeSafi";

        Participant participant = new Participant();
        participant.setFname(fname);
        participant.setLname(lname);
        participant.setEmail(email);
        participant.setPhone(phone);
        participant.setPassword(password);
        participant.setRole(new Role("role"));
        participant.setDomaine(domaine);
        participant.setStatus(status);
        participant.setStructure(structure);
        Participant participant1 = participantServie.save(participant);
        Participant participant2 = participantServie.find(Integer.parseInt(participant1.getId().toString()));
        assertEquals(participant1,participant2);


    }
     @Test
      void checkIfParticipantUpdate(){
         int id = 352;
         String Domaine = "AWS";
         String Email ="abdessamad@gmail.com";
         String Fname = "abdessamad";
         String Lname = "abdessamad";
         String Phone = "0746352647";;
         boolean Status =true;
         String Role = "";
         String Structure ="YouCode";

         Participant Participant = participantServie.find(id);
         Participant.setFname(Fname);
         Participant.setLname(Lname);
         Participant.setEmail(Email);
         Participant.setPhone(Phone);
         Participant.setRole(new Role( "Admin"));
         Participant.setDomaine(Domaine);
         Participant.setStatus(Status);
         Participant.setStructure(Structure);
         participantServie.save(Participant);
         Participant participant1 = participantServie.save(Participant);
         Participant participant2 = participantServie.find(Integer.parseInt(participant1.getId().toString()));
         assertEquals(participant1,participant2);
     }

}