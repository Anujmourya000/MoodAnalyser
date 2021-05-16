package com.moodanalyser;

/**
 * @description Class for defining the Mood Analyser
 * @param
 *
 */
public class MoodAnalyser {
    /**
     * @description Constructor for Mood Analyser
     * @param
     *
     */
    public MoodAnalyser(String message) {
        if(message.contains("SAD"))
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
}
