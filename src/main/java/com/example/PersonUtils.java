package com.example;

public class PersonUtils {

    private static PersonUtils instance = null;

    private PersonUtils(){}



    public PersonUtils getInstance() {

        if(instance==null) {
            instance=new PersonUtils();
        }

        return instance;
    }

    public final String operacja(Person  person) {
        return person.name.toUpperCase();
    }

}
