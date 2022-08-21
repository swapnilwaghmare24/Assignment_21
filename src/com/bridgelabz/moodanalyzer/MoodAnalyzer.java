package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String msg)
    {
        if(msg.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
