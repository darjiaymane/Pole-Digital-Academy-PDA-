package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Dao.Implementations.ParticipantDAOimpl;
import com.example.poledigitalacademypda.Dao.Specs.ParticipantDao;
import com.example.poledigitalacademypda.Entities.Participant;

import java.util.List;

public class ParticipantServie {

    ParticipantDao participantDaoImpl = new ParticipantDAOimpl();

    public Participant save(Participant participant) {return this.participantDaoImpl.save(participant);}

    public Participant find(int id){
        Participant participant = this.participantDaoImpl.find(id);
        return participant;
    }


    public List<Participant> findAll(){
        List<Participant> participantList;
        participantList = this.participantDaoImpl.findAll();
        return participantList;
    }

     public Participant update(Participant participant){
        return this.participantDaoImpl.update(participant);
    }

}
