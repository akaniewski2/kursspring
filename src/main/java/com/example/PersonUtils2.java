package com.example;

public enum PersonUtils2 {

    INSTANCE;

    public final String operacja(Person  person) {
        return person.name.toUpperCase();
    }

}
