package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Knight;

import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {



    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    //@PostConstruct
    void build();


    public Knight getKnightById(Integer id) ;

    void createKnight(Knight knight);
}
