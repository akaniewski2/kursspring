package com.example.kursspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Value("lance")
    private String name;
    @Value("23")
    private int age;

//    private  Quest quest;

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

//    public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public void  setQuest (Quest quest) {
//        this.quest=quest;
//    }

    // jesli chcemy wstrzykiwac przez metode
    private Quest quest;
    @Autowired
        public void  setQuest (Quest quest) {
        this.quest=quest;
    }


    public Knight() {
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age + ", quest=" + //quest +
                '}';
    }
}
