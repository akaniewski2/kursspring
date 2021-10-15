package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tournament {

    @Autowired
    @Qualifier(value="percival")
    Knight knight;

//    @Autowired
//    public Tournament( @Qualifier(value="percival") Knight knight) {
//        this.knight = knight;
//    }








    public Tournament(){

    }

    public void duel (){
        knight.setAge(knight.getAge()+1);
    }
    @Override
    public String toString() {
        return "W turnieju bierze udzial rycerz "+knight ;
    }
}
