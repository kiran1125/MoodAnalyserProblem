package com.bridgelabz;

/**
 * This class is to analyse the mood of the user
 */
public class MoodAnalyser {
    //class variables
    String message;

    /**
     * Default constructor
     */
    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message = message;
    }
    /**
     * this method is to analyse the mood
     * @return sad or happy
     */
    public String analyseMood() {
        //Checking the condition
        if (message.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
