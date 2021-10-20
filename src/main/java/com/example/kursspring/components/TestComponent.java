package com.example.kursspring.components;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class TestComponent {

    @PostConstruct
    public void testVoid(){
        System.out.println("Zaladowano TestComponent");
    }

    @PreDestroy
    public void testVoid2(){
        System.out.println("Zniszczono TestComponent");
    }

}
