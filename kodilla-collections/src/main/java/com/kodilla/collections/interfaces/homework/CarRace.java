package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford();
        Car opel = new Opel();
        Car toyota = new Audi();

        System.out.println("Wynik wyścigu dla Forda: " + doRace(ford));
        System.out.println("Wynik wyścigu dla Opla: " + doRace(opel));
        System.out.println("Wynik wyścigu dla Audi: " + doRace(toyota));
    }

    public static int doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        return car.getSpeed();
    }
}
