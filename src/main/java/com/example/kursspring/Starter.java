package com.example.kursspring;

import com.example.kursspring.controllers.HelloController;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import com.example.kursspring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    //! aby zobaczyc efekt nalezy w void run dac sout
   @Autowired
   //@Qualifier("inMemoryKnigthRepository")
    KnightRepository knightRepository;
   @Autowired
   QuestRepository questRepository;

   @Autowired
   QuestService questService;

//   @Autowired
//   HelloController helloController;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start CommandLineRunner");

;

//        questService.assignRandomQuest("Lancelot");
//        questService.assignRandomQuest("Percival");

        System.out.println(knightRepository);
        System.out.println(questRepository);

        questRepository.createRandomQuest();
       // System.out.println(questRepository);
        questRepository.createRandomQuest();
       // System.out.println(questRepository);
        questRepository.createRandomQuest();
       // System.out.println(questRepository);


        System.out.println("Koniec CommandLineRunner");



//        Quest quest1 = new Quest("Uratuj Księżniczke");
//        Knight lancelot = new Knight("lanselot",29,quest1);
//        System.out.println(lancelot);
//
//        Quest quest2 = new Quest("Zabij Smoka");
//        Knight percival = new Knight("persival",39 );
//        System.out.println(percival);
//        percival.setQuest(quest2);
//        System.out.println(percival);


    }
}
