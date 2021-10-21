package com.example.kursspring.domain;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

import javax.validation.constraints.*;
import java.util.Objects;

public class Knight {

    private int id;
   // @Value("dasdsad")


    @NotNull
    @Size(min=5,max=40)
    @NotBlank
    private String name;

    @NotNull
//  @Range(min=18,max=60)//nie dziala
    @Min(value = 18, message = "Jestes niepelnoletni! ")
    @Max(40)
    private int age;

    private int level;


    private Quest quest;

    public Knight() {
        this.level = 1;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest = quest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + "(" + age + "). Ma za zadanie: " + quest;
    }
}


