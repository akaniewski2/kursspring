package com.example.kursspring.controllers;


import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.PlayerInformation;
import com.example.kursspring.domain.Quest;
import com.example.kursspring.services.KnightService;
import com.example.kursspring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuestController {

    @Autowired
    KnightService knightService;

    @Autowired
    QuestService questService;

    @Autowired
    PlayerInformation playerInformation;





    @RequestMapping("/assignQuest")
    public String assignQuest(@RequestParam("knightId") Integer id, Model model) {

        Knight knight = knightService.getKnight(id);
        //pobranie nierozpoczetych questow
        List<Quest> notStartedQuests=questService.getAllNotStartedQuests();


        model.addAttribute("knight", knight);
        model.addAttribute("notStartedQuest",notStartedQuests);


        return "form_assign_Quest";
    }

    @RequestMapping(value = "/assignQuest",method = RequestMethod.POST)
    public String assignQuest(Knight knight) {

        knightService.updateKnight(knight);
        Quest quest = knight.getQuest();
        questService.update(quest);

        return "redirect:/knights";
    }

    @RequestMapping(value = "/checkQuests",method = RequestMethod.GET)
    public String checkQuests() {

        knightService.getMyGold();

        return "redirect:/knights";
    }

}
