package com.moodanalyser;

/**
 * @description Class for defining the Mood Analyser
 * @param
 *
 */
public class MoodAnalyser {
    /**
     * @description Constructor for Mood Analyser
     */
    public MoodAnalyser(String message) {
        if (message.contains("SAD"))
            analyseMood();
        else
            analyseMood1();
    }

    //method for calling in constructor
     public String analyseMood() {
            return "SAD";
        }
     public String analyseMood1(){
        return  "HAPPY";
    }

    public String analyseMood2(String message) {
    try {
        if(message.contains("HAPPY"))
        return "Happy";
    } catch (NullPointerException e) {
        return "HAPPY";
    }
    return message;
    }
}
