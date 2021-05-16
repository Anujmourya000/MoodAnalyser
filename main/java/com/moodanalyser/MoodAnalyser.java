package com.moodanalyser;

/**
 * @description Class for defining the Mood Analyser
 * @param
 *
 */
public class MoodAnalyser {
    /**
     * @description Constructor fot Mood Analyser
     * @param
     *
     */
    public MoodAnalyser(String message) {
        if(message.contains("SAD"))
        analyseMood();
    }
    //method for calling in constructor
    public String analyseMood() {
        return "SAD";
    }
}
