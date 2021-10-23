package com.example.kursspring.domain;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.*;


public class QestTest {

    @Test
    public void settingStartedFlagToFAlseShouldSetStartDate(){

    Quest quest = new Quest(1,"Testowe zadanie");
    quest.setStarted(true);

    assertNotNull(quest.startDateTime);

    }

    @Test
    public void questShouldBeCompleted() {
        Quest quest = new Quest(1,"Testowe zadanie");
        quest.setStarted(true);
        quest.lenghtInSeconds=-60;
        assertTrue( quest.isCompleted());
        assertTrue( quest.isCompleted());
    }

    @Test
    public void questShouldNotBeCompleted() {

        Quest quest = new Quest(1,"Testowe zadanie");
        quest.setStarted(true);
        quest.lenghtInSeconds=20000;
        assertFalse( quest.isCompleted());
        assertFalse( quest.isCompleted());

    }
}
