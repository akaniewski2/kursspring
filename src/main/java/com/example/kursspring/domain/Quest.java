package com.example.kursspring.domain;



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
        this.description = description;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }


}
