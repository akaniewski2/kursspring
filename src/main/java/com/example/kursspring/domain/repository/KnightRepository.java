package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KnightRepository {


    Map<String, Knight> knights= new HashMap<>();

   public void createKnight (String name,int age) {
       knights.put(name,new Knight(name,age));

   }

   public Collection<Knight> getAllKnights(){
       return knights.values();
   }

   public Knight getKnight(String name){
       return knights.get(name);
   }

   public void deleteKnight(String name){
       knights.remove(name);
   }


    public KnightRepository() {
    }




    @PostConstruct
    public void build(){
        System.out.println("# build" );
        createKnight("Lancelot",23);
        createKnight("Percival",22);
//        createKnight("X-man",26);
//        createKnight("Y-man",23);
    }


    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}

