import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Manager;
import com.example.poledigitalacademypda.Entities.Participant;
import com.example.poledigitalacademypda.Services.ManagerService;
import com.example.poledigitalacademypda.Services.ParticipantServie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class main {
    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        Manager manager = entityManager.find(Manager.class,-48);
//        System.out.println(manager.getEmail());
//       ManagerService managerService = new ManagerService();
//        List<Manager> managerList;
//        managerList = managerService.findAll();

//        managerList.stream().forEach(System.out::println);

       // managerService.delete(-48);
        ParticipantServie participantServie = new ParticipantServie();
        List<Participant> participantList;
        participantList = participantServie.findAll();
        participantList.stream().forEach(System.out::println);


//        Manager manager = managerService.find(102);
//        System.out.println(manager);
//
//        manager.setFname("Bon Jovi");
//        managerService.update(manager);
//
//        manager = managerService.find(manager.getId().intValue());
//        System.out.println("Artist = " + manager);

    }
}