package com.example.kursspring.domain.repository;

import com.example.kursspring.Utils.Ids;
import com.example.kursspring.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
//@Scope("prototype")
public class QuestRepository {
    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Quest getQuests(Integer id) {
        return quests.get(id);
    }

    public void setQuests(Map<Integer, Quest> quests) {
        this.quests = quests;
    }

    Random rand= new Random();

    Map<Integer,Quest> quests = new HashMap<>();
//    List<Quest> questList= new ArrayList<>();

    public void createQuest(String description) {

        int newId = Ids.generateNewId(quests.keySet());
        Quest quest = new Quest(newId,description);
        quests.put(newId,quest);

    }

    public void deleteQuest (Quest quest) {

        quests.remove(quest.getId());


    }
    public List<Quest> getAll(){
        return /*(List<Quest>)*/ new ArrayList<>(quests.values());
    }

// to bylo do listy
//    public List<Quest> getAll(){
//        return quests;
//    }

    @PostConstruct
    public void init(){

//        createQuest("Uratuj Fione");
//        createQuest("Wez udzial w turnieju");


    }

//    @Scheduled(fixedDelay = 1000) // liczona od momentu zakonczenia calej metody
   // @Scheduled(fixedDelay = 1000,initialDelay = 3000) // liczona od momentu zakonczenia calej metody + opoznienie initialDelay
    //@Scheduled(fixedRate = 1000) // liczona od momentu uruchomienia metody

    @Scheduled(fixedDelayString = "${questCreationDelay}") // z config
    //dal xmla jest jakis blad
    public void createRandomQuest(){
        System.out.println("# Start createRandomQuest()");
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(rand.nextInt(descriptions.size()))+" nr. "+rand.nextInt(descriptions.size());
        createQuest(description);
        System.out.println(description);

        System.out.println("# Koniec createRandomQuest()");

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "quests=" + quests +
                '}';
    }

    public void update(Quest quest) {

        quests.put(quest.getId(),quest);

    }
}
