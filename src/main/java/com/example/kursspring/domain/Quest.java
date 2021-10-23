package com.example.kursspring.domain;


import java.time.LocalDateTime;

public class Quest {

    private int id;
    private String description;
    protected LocalDateTime startDateTime;

    public Quest(int id,String description) {
        this.description = description;
        this.id=id;
    }

//
//    public Quest() {
//    }
//
//    // jesli chcemy wstrzykiwac przez metode
//    public Quest(String description) {
//        this.description = "uratuj ksiezniczke";
//    }
    private int reward =  100;
    protected int lenghtInSeconds =10; //30s
    private boolean started =false;
    private boolean completed = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Quest() {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }



    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
        if(started) {
            this.startDateTime=LocalDateTime.now();
        }
    }

    public boolean isCompleted() {
        //- scenariusz na this.completed= true  --------------------------------------------
        if (this.completed){
            return this.completed;
        }

        //- scenariusz na this.completed= false  --------------------------------------------
        LocalDateTime questEndDtTm=LocalDateTime.now();
        LocalDateTime localDateTime = this.startDateTime.plusSeconds(this.lenghtInSeconds);
        boolean isAfter = questEndDtTm.isAfter(localDateTime);

        if(isAfter) {
            this.completed=true;
        }
        return isAfter;

         
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return   description ;
    }

//    @Override
//    public String toString() {
//        return "toString: Quest{" +
//                "description='" + description + '\'' +
//                '}';
//    }



}
