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

//@Repository
public class InMemoryKnightRepository implements KnightRepository {


    Map<String, Knight> knights= new HashMap<>();

   @Override
   public void createKnight(String name, int age) {
       knights.put(name,new Knight(name,age));

   }

   @Override
   public Collection<Knight> getAllKnights(){
       return knights.values();
   }

   @Override
   public Knight getKnight(String name){
       return knights.get(name);
   }

   @Override
   public void deleteKnight(String name){
       knights.remove(name);
   }


    public InMemoryKnightRepository() {
    }




    @Override
    @PostConstruct
    public void build(){
        System.out.println("# build @PostConstruct"  );
        createKnight("Lancelot",23);
        createKnight("Percival",22);
    }


    @Override
    public String toString() {
        return "InMemoryKnightRepository{" +
                "knights=" + knights +
                '}';
    }
}

