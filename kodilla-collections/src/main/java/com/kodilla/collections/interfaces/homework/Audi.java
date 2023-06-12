package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 12;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 6;
    }
}
