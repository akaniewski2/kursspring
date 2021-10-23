package com.example.kursspring.services;

import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import org.apache.tomcat.util.descriptor.InputSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//QuestService klasy bezstanowe,singleton,zawieraja zestaw publicznych metod realizujacych cele logiki biznesowe
@Service
public class QuestService {

    @Autowired
    //@Qualifier("inMemoryKnigthRepository")
    KnightRepository knightRepository;
    //@Autowired -> przeniesione do setera na potrzeby testu c.d.n...
    QuestRepository questRepository;


    final static Random rand=new Random();

    public void assignRandomQuest(String kightName){

        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(kightName).ifPresent(knight -> knight.setQuest(randomQuest));
        questRepository.deleteQuest(randomQuest);


    }


    public List<Quest> getAllNotStartedQuests() {

        List<Quest> collect = questRepository.getAll().stream().filter(quest -> !quest.isStarted()).collect(Collectors.toList());
        System.out.println("#" + collect.get(0));
        return collect;
    }

    @Autowired //c.d dzieki temu z poziomu testow mozna wstrzyknąć wlasnie repo
    public void setQuestRepository(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public void update(Quest quest) {
        questRepository.update(quest);

    }

    public boolean isQuestCompleted(Quest quest){
        return quest.isCompleted();
    }

}
