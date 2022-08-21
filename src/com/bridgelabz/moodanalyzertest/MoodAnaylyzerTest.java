package com.bridgelabz.moodanalyzertest;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnaylyzerTest {
    MoodAnalyzer moodAnalyzer;
    @Before
    public void everyTest()
    {
       moodAnalyzer= new MoodAnalyzer();
    }

    @Test
    public void isSadMood()
    {
        String result = moodAnalyzer.analyzeMood("I am in Sad mood");
        assertEquals("Sad",result);
    }

    @Test
    public void isHappyMood()
    {
        String result= moodAnalyzer.analyzeMood("I am in Any mood");
        assertEquals("Happy",result);
    }
    @Test
    public void isNullMood()
    {
        String result= moodAnalyzer.analyzeMood("NULL");
        assertEquals("Happy",result);
    }
}
