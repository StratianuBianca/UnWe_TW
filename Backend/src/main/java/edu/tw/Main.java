package edu.tw;

import edu.tw.contoller.AgeController;
import edu.tw.database.entity.Age;
import edu.tw.database.entitymanager.EntityManagerProvider;
import edu.tw.database.repository.EnvironmentRepository;
import edu.tw.database.repository.AgeRepository;
import edu.tw.services.AgeService;

import javax.persistence.EntityManager;
import javax.ws.rs.core.Response;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AgeController ageController=new AgeController();
    //    List<Age> ageList=ageController.getAll();
       EntityManager entityManager= EntityManagerProvider.getEntityManagerFactory().createEntityManager();
        Age age =new Age();
        AgeService ageService=new AgeService();
        AgeRepository ageRepository =new AgeRepository(entityManager);
        //System.out.println(ageRepository.findByLuna(2));
        EnvironmentRepository environmentRepository =new EnvironmentRepository(entityManager);
       // System.out.println(environmentRepository.findByLuna(1));
        List<Age> ages=ageController.getAll();
     //  System.out.println(ages);
    //    entityManager.close();
   //      return url;
        System.out.println(args);
    }
}
