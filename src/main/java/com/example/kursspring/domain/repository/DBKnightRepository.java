package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;


import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

//@Repository
public class DBKnightRepository implements KnightRepository{

    @Override
    public void createKnight(String name, int age) {
        System.out.println("uzywam bazy danych");

//        throw new NotImplementedException() // zwraca jakis blad przy kompilacji

//         throw new UnsupportedOperationException();

    }

    @Override
    public Collection<Knight> getAllKnights(){
        System.out.println("uzywam bazy danych");
//        throw new UnsupportedOperationException();
        return null;
    }

    @Override
    public Optional<Knight> getKnight(String name){
        System.out.println("uzywam bazy danych");
//        throw new UnsupportedOperationException();
        return null;
    }

    @Override
    public void deleteKnight(Integer id) {

    }


    @Override
    @PostConstruct
    public void build(){
        System.out.println("# build DB @PostConstruct"  );
//        throw new UnsupportedOperationException();


    }

    @Override
    public Knight getKnightById(Integer id) {
        return null;
    }



    @Override
    public void createKnight(Knight knight) {
        //implementacja metody
    }
}
