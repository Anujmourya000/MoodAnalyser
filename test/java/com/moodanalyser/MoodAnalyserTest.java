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
    public void check_For_Happy_Should_Pass_TestCase() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void check_For_Message_Should_Return_SAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in SAD mood");
        Assertions.assertEquals("SAD", mood);
    }
}
