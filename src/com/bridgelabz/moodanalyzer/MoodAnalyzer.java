package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String msg)
    {
        try
        {
            if(msg.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        }
        catch (NullPointerException e)
        {
            return "Happy";
        }
    }

    public String customException(String msg) throws MoodAnaylyzeException
    {
        if(msg.contains("Sad"))
            return "Sad";
        else if (msg.contains("Happy")||msg.contains("Any"))
           return "Happy";

       else throw new MoodAnaylyzeException("Invalid mood");


    }
}
