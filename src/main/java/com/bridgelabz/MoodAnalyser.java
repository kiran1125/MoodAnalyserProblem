package com.bridgelabz;

/**
 * This class is to analyse the mood of the user
 */
public class MoodAnalyser {
    enum msg{
        NULL,EMPTY;
    }
    //class variables
    String message;

    /**
     * Default constructor
     */

    public MoodAnalyser(){

    }

    /**Parameterized constructor to assign value for the string message
     *
     * @param message
     */

    public MoodAnalyser(String message){
        this.message = message;
    }

    /**
     * this method is to analyse the mood
     * @return sad or happy
     */

    public String analyseMood() {
        //Checking the condition
        msg m1 = msg.NULL;
        msg m2 = msg.EMPTY;
        try {
            if (message == m1.name())
                throw new NullPointerException("Null mood");
            if (message == m2.name())
                throw new MoodAnalyserException("Empty Mood");
            if (message.contains("Sad")) {
                return "Sad";
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (MoodAnalyserException me){
            System.out.println(me);
        }
        return "Happy";
    }
}
