package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    private int speed;

    public Opel() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed = 35;
    }

    @Override
    public void increaseSpeed() {
        speed += 8;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 4;
    }

    @Override
    public String toString() {
        return "Opel";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
