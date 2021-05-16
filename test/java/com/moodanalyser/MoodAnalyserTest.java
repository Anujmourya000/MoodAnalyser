package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @description class for defining the Mood Analyser Test
 *
 *
 */
public class MoodAnalyserTest {

    @Test
    public void check_For_Message_Should_Return_SAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void check_For_Message_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in HAPPY mood");
        String mood = moodAnalyser.analyseMood1();
        Assertions.assertEquals("HAPPY", mood);
    }
}
