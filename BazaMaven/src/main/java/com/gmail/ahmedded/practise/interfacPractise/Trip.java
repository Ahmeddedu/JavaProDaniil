package com.gmail.ahmedded.practise.interfacPractise;

public interface Trip {
    void startEngine();
    void goPoint();
    void endEngine();

    default void runTrip(){
        startEngine();
        goPoint();
        endEngine();
    }
}
