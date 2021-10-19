package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;
import org.springframework.stereotype.Repository;


import javax.annotation.PostConstruct;
import java.util.Collection;

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
    public Knight getKnight(String name){
        System.out.println("uzywam bazy danych");
//        throw new UnsupportedOperationException();
        return null;
    }

    @Override
    public void deleteKnight(String name) {
        System.out.println("uzywam bazy danych");

//        throw new UnsupportedOperationException();

    }

    @Override
    @PostConstruct
    public void build(){
        System.out.println("# build DB @PostConstruct"  );
//        throw new UnsupportedOperationException();


    }

    @Override
    public void createKnight(Knight knight) {
        //implementacja metody
    }
}
