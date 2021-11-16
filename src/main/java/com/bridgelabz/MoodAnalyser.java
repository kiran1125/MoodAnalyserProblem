package com.bridgelabz;

/**
 * This class is to analyse the mood of the user
 */
public class MoodAnalyser {
    /**
     * this method is to analyse the mood
     * @param str
     * @return sad or happy
     */
    public String analyseMood(String str) {
        //Checking the condition
        if (str.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
