package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start CommandLineRunner");






//        Quest quest1 = new Quest("Uratuj Księżniczke");
//        Knight lancelot = new Knight("lanselot",29,quest1);
//        System.out.println(lancelot);
//
//        Quest quest2 = new Quest("Zabij Smoka");
//        Knight percival = new Knight("persival",39 );
//        System.out.println(percival);
//        percival.setQuest(quest2);
//        System.out.println(percival);

        System.out.println("Koniec CommandLineRunner");
    }
}
