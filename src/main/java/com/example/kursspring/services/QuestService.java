package com.example.kursspring.services;

import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

//QuestService klasy bezstanowe,singleton,zawieraja zestaw publicznych metod realizujacych cele logiki biznesowe
@Service
public class QuestService {

    @Autowired
    //@Qualifier("inMemoryKnigthRepository")
    KnightRepository knightRepository;
    @Autowired
    QuestRepository questRepository;


    final static Random rand=new Random();

    public void assignRandomQuest(String kightName){

        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(kightName).ifPresent(knight -> knight.setQuest(randomQuest));
        questRepository.deleteQuest(randomQuest);


    }


}
