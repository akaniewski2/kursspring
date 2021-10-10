package com.example.kursspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "East Watch";

    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek "+ name );
    }

    @PreDestroy
    public void tearaDown(){
        System.out.println("Zaraz wyburzymy zamek "+ name );
    }
}
