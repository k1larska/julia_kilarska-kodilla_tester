package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
        public static void main(String[] args) {
            List<Car> cars = new ArrayList<>();
            Audi audi = new Audi();
            cars.add(audi);
            cars.add(new Ford());
            cars.add(new Opel());

            cars.remove(audi);
            cars.remove(1);


            System.out.println(cars.size());
            for (Car car : cars) {
                CarUtils.describeCar(car);
            }
        }
}
