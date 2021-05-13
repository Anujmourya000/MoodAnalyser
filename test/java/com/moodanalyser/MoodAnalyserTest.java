package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void check_For_Happy_Should_Pass_TestCase() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void check_For_Sad_Should_Fails_TestCase() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assertions.assertEquals("SAD", mood);
    }
}
