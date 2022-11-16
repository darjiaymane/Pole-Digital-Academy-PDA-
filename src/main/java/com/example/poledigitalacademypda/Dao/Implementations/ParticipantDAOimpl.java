package com.example.poledigitalacademypda.Dao.Implementations;

import com.example.poledigitalacademypda.Dao.Specs.ParticipantDao;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Participant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class ParticipantDAOimpl implements ParticipantDao {
    EntityManager entityManager;


    public ParticipantDAOimpl() {
        entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public Participant find(int id) {
         return this.entityManager.find(Participant.class,id);
    }

    @Override
    public List<Participant> findAll() {
        List<Participant> participantList = this.entityManager.createQuery("SELECT part FROM Participant part", Participant.class).getResultList();
        return participantList;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Participant save(Participant participant) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(participant);
        this.entityManager.getTransaction().commit();
        return participant;
    }

    @Override
    public Participant update(Participant participant) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(participant);
        this.entityManager.getTransaction().commit();
        return participant;
    }
}
