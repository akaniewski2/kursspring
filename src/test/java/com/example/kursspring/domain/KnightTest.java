package com.example.kursspring.domain;

import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertTrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {

    @Test
    public void testIfQuestMarkedAsStarted() {
     Knight knight = new Knight("Percival",25);
     Quest quest = new Quest(1,"testowe zadanie");

     knight.setQuest(quest);

        assertTrue(knight.getQuest().isStarted());

    }
}
