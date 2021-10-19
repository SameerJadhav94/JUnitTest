package org.bridgelabz.assignmenttwenty;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageSadShouldReturnSad(){
       MoodAnalyser moodAnalyser = new MoodAnalyser();
       boolean mood = moodAnalyser.analyzeMood("Sad");
        Assert.assertTrue(mood);
    }

    @Test
    public void givenMessageNotSadShouldReturnHappy(){
       MoodAnalyser moodAnalyser = new MoodAnalyser();
       boolean mood = moodAnalyser.analyzeMood("Happy");
        Assert.assertTrue(mood);
    }
}
