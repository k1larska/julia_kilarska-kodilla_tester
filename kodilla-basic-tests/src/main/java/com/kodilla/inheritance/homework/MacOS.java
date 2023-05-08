package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystems {
    public MacOS(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("MacOS is starting up...");
    }
    @Override
    public void turnOff() {
        System.out.println("MacOS is shutting down...");
    }
}
