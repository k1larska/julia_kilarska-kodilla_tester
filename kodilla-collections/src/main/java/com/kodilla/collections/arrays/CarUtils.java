package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car description:");
        System.out.println("Speed: " + car.getSpeed());
    }
}