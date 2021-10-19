package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//@Repository
public class InMemoryKnightRepository implements KnightRepository {


    Map<Integer, Knight> knights= new HashMap<>();

   @Override
   public void createKnight(String name, int age) {
       Knight knight =new Knight(name,age);
       knight.setId(getNewId());
       knights.put(knight.getId(),new Knight(name,age));

   }

    public int getNewId() {
       if(knights.isEmpty()){
           return 0;
       } else
       {
           Integer max = knights.keySet().stream().max(Integer::max).get();
           return max+1;
       }


    }

    @Override
   public Collection<Knight> getAllKnights(){
       return knights.values();
   }

   @Override
   public Optional<Knight> getKnight(String name){

       Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();
       //tak sie nie powinno robic
       //return knights.get(knightByName.orElseGet(null));

       return knightByName;
   }

   @Override
   public void deleteKnight(Integer id){
       knights.remove(id);
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
    public Knight getKnightById(Integer id) {
        return knights.get(id);
    }

    @Override
    public void createKnight(Knight knight) {

    }


//    @Override
//    public void createKnight(Knight knight) {
//        knights.put(knight.getName(),knight);
//    }


    @Override
    public String toString() {
        return "InMemoryKnightRepository{" +
                "knights=" + knights +
                '}';
    }
}

