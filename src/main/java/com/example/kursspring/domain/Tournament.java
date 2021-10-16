package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Component
public class Tournament {

    @Autowired
   // @Qualifier(value="percival")
//    knights knights;
//    List<Knight> knights;

    Map<String, Knight> knights; // map - mozna ogranczac wstrzykiwane beany, map wstrzykujemy tylko przy pomocy xml

//            Set<Knight> knights;

//    @Autowired
//    public Tournament( @Qualifier(value="percival") knightss knights) {
//        this.knights = knights;
//    }




//   public void setKnights(List<Knight> knights){this.knights=knights;}
   // public void setKnights(Set<Knight> knights){this.knights=knights;}
public void setKnights(Map<String,Knight> knights){this.knights=knights;}






    public Tournament(){

    }

    public void duel (){
       // knights.setAge(knights.getAge()+1);
    }
    @Override
    public String toString() {
    // przy map sie to krzaczy  - trzeba by przerobic
        return "W turnieju bierze udzial rycerz(e) "+ knights.stream().map(Object::toString).collect(Collectors.joining(",")) ;
    }
}
