package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //po wykomentowaniu tego, ne dziala anotacja propertysource
//@PropertySource("classpath:castle.properties") // wartosci z nowego pliku properties
public class Castle {
// wstrzykiwanie do pola obiektu przez reflection ipi 'ajpiaj'
//@Value("East Watch")
// @Value("${my.castle.name}")
@Value("${my.castle.name:Black Castle}") // z wartoscia domyslna
private String name ;//= "East Watch";

    Knight knight;

   // Knight knight;




//     @Autowired
//     public Castle(String name) {
//        this.name = name;
//    }

//    public Castle() {
//    }

    // wstrzykiwanie poprzez kostruktor
    @Autowired
    public Castle(@Qualifier(value="lancelot") Knight knight) { this.knight = knight;  }
//    public Castle(Knight knight) { this.knight = knight;  }

//    public Castle(Knight knight,String name) {
//        this.knight = knight;
//        this.name = name;
//    }

    public void setName(String name) {
         this.name=name;
    }

    //

    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek "+ name + " zamieszkaly przez rycerza "+knight);
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("Zaraz wyburzymy zamek "+ name + " zamieszkaly przez rycerza "+knight );
    }

    @Override
    public String toString() {
        return "Zamek toString "+ name + ", rycerz " +knight;
    }
}
