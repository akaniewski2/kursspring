package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Quest;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
//@Scope("prototype")
public class QuestRepository {

    Random rand= new Random();

    List<Quest> questList= new ArrayList<>();

    public void createQuest(String description) {

        questList.add(new Quest(description));

    }

    public void deleteQuest (Quest quest) {

        questList.remove(quest);


    }


    public List<Quest> getAll(){
        return questList;
    }

    @PostConstruct
    public void init(){

//        createQuest("Uratuj Fione");
//        createQuest("Wez udzial w turnieju");


    }

//    @Scheduled(fixedDelay = 1000) // liczona od momentu zakonczenia calej metody
   // @Scheduled(fixedDelay = 1000,initialDelay = 3000) // liczona od momentu zakonczenia calej metody + opoznienie initialDelay
    //@Scheduled(fixedRate = 1000) // liczona od momentu uruchomienia metody

   // @Scheduled(fixedDelayString = "${questCreationDelay}") // z config
    //dal xmla jest jakis blad
    public void createRandomQuest(){
        System.out.println("# Start createRandomQuest()");
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);
        System.out.println(description);

        System.out.println("# Koniec createRandomQuest()");

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
