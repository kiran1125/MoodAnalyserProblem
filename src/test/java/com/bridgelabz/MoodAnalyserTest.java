package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMessageShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assertions.assertEquals("Sad",moodAnalyser.analyseMood("This is a Sad Message"));
    }
    @Test
    public void givenHappyMessageShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assertions.assertEquals("Happy",moodAnalyser.analyseMood("This is a Happy Message"));
    }
}
