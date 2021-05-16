package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @description Class for defining the Mood Analyser Test
 * @param
 *
 */
public class MoodAnalyserTest {

    @Test
    public void check_For_Message_Should_Return_SAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

}
