package com.example.kursspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Create Knight");

        Quest quest1 = new Quest("Uratuj Księżniczke");
        Knight lancelot = new Knight("lanselot",29,quest1);
        System.out.println(lancelot);

        Quest quest2 = new Quest("Zabij Smoka");
        Knight percival = new Knight("persival",39 );
        System.out.println(percival);
        percival.setQuest(quest2);
        System.out.println(percival);
    }
}
