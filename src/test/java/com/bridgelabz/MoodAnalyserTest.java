package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMessageShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad message");
        Assertions.assertEquals("Sad",moodAnalyser.analyseMood());
    }
    @Test
    public void givenHappyMessageShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy message");
        Assertions.assertEquals("Happy",moodAnalyser.analyseMood());
    }
    @Test
    public void givenNullMessageShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        Assertions.assertEquals("Happy",moodAnalyser.analyseMood());
    }
    @Test
    public void givenEmptyMessageShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("EMPTY");
        Assertions.assertEquals("Happy",moodAnalyser.analyseMood());
    }
    @Test
    public void givenNULLMessageShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("NULL");
        Assertions.assertEquals("Happy",moodAnalyser.analyseMood());
    }
}
