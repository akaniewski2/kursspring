package com.example.kursspring.services;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
@Service
public class KnightService {

    @Autowired
    KnightRepository knightRepository;

    public List<Knight> getAllKnights(){
//        List<Knight> knights = new ArrayList<>(knightRepository.getAllKnights());
//        return knights;
        // od razu zwracamy
        System.out.println("# getAllKnights" + knightRepository.getAllKnights());
        return new ArrayList<>(knightRepository.getAllKnights());
    }

    public void saveKnight(Knight knight) {
        knightRepository.createKnight(knight);

    }


    public Knight getKnight(Integer id) {
        return knightRepository.getKnightById(id);
    }
}
