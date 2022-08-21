package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String msg)
    {
        try
        {
            if (msg == "NULL");
        }
        catch (Exception e)
        {
            return "Happy";
        }

        if(msg.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
