package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Implementations.ManagerDAOImpl;
import com.example.poledigitalacademypda.Dao.Implementations.ParticipantDAOimpl;
import com.example.poledigitalacademypda.Dao.Specs.ParticipantDao;
import com.example.poledigitalacademypda.Entities.Participant;
import com.example.poledigitalacademypda.Repository.Specs.ParticipantRepository;

import java.util.List;

public class ParticpantRepository implements ParticipantRepository {
    ParticipantDao participantDao;
    public ParticpantRepository() {
        participantDao = new ParticipantDAOimpl();
    }
    @Override
    public Participant find(int id) {
        return this.participantDao.find(id);
    }

    @Override
    public List<Participant> findAll() {
        return this.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Participant save(Participant participant) {
        return null;
    }

    @Override
    public Participant update(Participant participant) {
        return null;
    }
}
