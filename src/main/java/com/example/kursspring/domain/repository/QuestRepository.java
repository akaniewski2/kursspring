package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Quest;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

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
        createQuest("Uratuj Fione");
        createQuest("Wez udzial w turnieju");
//        createQuest("Wez udzial w turnieju X");
//        createQuest("Wez udzial w turnieju Y");

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
