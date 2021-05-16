package com.moodanalyser;

public class MoodAnalysisException extends Exception{
    enum Exceptiontype{
        ENTERED_NULL, ENTERED_EMPTY
    }
    Exceptiontype type;

    public MoodAnalysisException(Exceptiontype type, String message) {
        super(message);
        this.type = type;
    }
}
