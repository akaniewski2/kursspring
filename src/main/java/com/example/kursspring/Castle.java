package com.example.kursspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("classpath:castle.properties") // wartosci z nowego pliku properties
public class Castle {
// wstrzykiwanie do pola obiektu przez reflection ipi 'ajpiaj'
//    @Autowired
//    Knight knight;

    Knight knight;



    //@Value("East Watch")
   // @Value("${my.castle.name}")
    @Value("${my.castle.name:Black Castle}") // z wartoscia domyslna
    private String name ;//= "East Watch";

    // wstrzykiwanie poprzez kostruktor
    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    //

    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek "+ name + " zamieszkaly przez rycerza "+knight);
    }

   @PreDestroy
    public void tearaDown(){
        System.out.println("Zaraz wyburzymy zamek "+ name + " zamieszkaly przez rycerza "+knight );
    }
}
