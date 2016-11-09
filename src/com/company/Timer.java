package com.company;

/**
 * Created by Dom on 09/11/2016.
 */
public class Timer {
    private double startTime;
    private double endTime;
    private double runTime;

    public Timer() {
        startTime = 0;
        endTime = 0;
        runTime = 0;
    }

    public void startTimer() {
        startTime = System.nanoTime();
    }

    public void endTimer() {
        endTime = System.nanoTime();
    }

    private void runTime() {
        runTime = endTime - startTime;
    }
}
