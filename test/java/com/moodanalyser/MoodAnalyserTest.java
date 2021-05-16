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
    public void check_For_Message_Should_Return_SAD()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void check_For_Message_Should_Return_HAPPY()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in HAPPY mood");
        String mood = moodAnalyser.analyseMood1();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void Null_Mood_Should_Return_HAPPY() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in HAPPY mood");
        String mood = moodAnalyser.analyseMood2(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void Empty_Mood_Should_throw_Exception() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood2(null);
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.Exceptiontype.ENTERED_NULL, e.type);
        }
    }
}
