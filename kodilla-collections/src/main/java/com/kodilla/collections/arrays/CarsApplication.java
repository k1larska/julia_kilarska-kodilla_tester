package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
        public static Car drawCar() {
            Random random = new Random();
            int randomSpeed = random.nextInt(100);
            Car car = new Opel();
            for (int i = 0; i < randomSpeed; i++) {
                car.increaseSpeed();
            }
            return car;
        }

        public static void main(String[] args) {
            Random random = new Random();
            int arraySize = random.nextInt(15) + 1;
            Car[] cars = new Car[arraySize];

            for (int i = 0; i < cars.length; i++) {
                cars[i] = drawCar();
            }

            for (Car car : cars) {
                CarUtils.describeCar(car);
            }
        }
}
