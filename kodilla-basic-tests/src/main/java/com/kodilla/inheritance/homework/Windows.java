package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystems {
    public Windows(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("Windows is starting up...");
    }
    @Override
    public void turnOff() {
        System.out.println("Windows is shutting down...");
    }
}
