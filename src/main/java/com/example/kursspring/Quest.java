package com.example.kursspring;

import org.springframework.stereotype.Component;

@Component // jesli chcemy wstrzykiwac przez metode
public class Quest {

    private String description;

//    public Quest(String description) {
//        this.description = description;
//    }


    public Quest() {
    }

    // jesli chcemy wstrzykiwac przez metode
    public Quest(String description) {
        this.description = "uratuj ksiezniczke";
    }
    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }
}
