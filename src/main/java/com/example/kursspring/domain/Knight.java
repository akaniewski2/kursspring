package com.example.kursspring.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype") // jesli inny bean ma zaleznosc od rycerza, wstrzykiwana jest tam nowa instancja od poczatkowego rycerza
public class Knight {

  // @Value("lance")
    private String name;
    @Value("23")
    private int age;

   private  Quest quest;

    public Knight(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }

    public Knight(String name, int age ) {
        this.name = name;
        this.age = age;

    }

//    public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public void  setQuest (Quest quest) {
//        this.quest=quest;
//    }

    // jesli chcemy wstrzykiwac przez metode
//    private Quest quest;
      // @Autowired
        public void  setQuest (Quest quest) {
           System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest=quest;
    }


    public Knight() {
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age + ", quest=" + quest +
                '}';
    }
}
