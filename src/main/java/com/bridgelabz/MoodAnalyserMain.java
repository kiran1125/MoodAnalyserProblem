package com.bridgelabz;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad message");
        System.out.println(moodAnalyser.analyseMood());
    }
}
