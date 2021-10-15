package com.example.kursspring.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // jesli chcemy wstrzykiwac przez metode
@Scope("prototype")
public class Quest {

    private String description;

    public Quest(String description) {
        this.description = description;
    }

//
//    public Quest() {
//    }
//
//    // jesli chcemy wstrzykiwac przez metode
//    public Quest(String description) {
//        this.description = "uratuj ksiezniczke";
//    }

    public Quest() {
        this.description = "uratuj ksiezniczke";
    }

    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }
}
