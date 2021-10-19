package org.bridgelabz.assignmenttwenty;


public class MoodAnalyser
{

    public boolean analyzeMood(String message) {
        return !message.contains("Sad");
    }
}
