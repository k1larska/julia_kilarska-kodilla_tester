package com.kodilla.inheritance.homework;

public class OperatingSystems {
    private int releaseYear;

    public OperatingSystems(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("System is turning on...");
    }

    public void turnOff() {
        System.out.println("System is turning off...");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
