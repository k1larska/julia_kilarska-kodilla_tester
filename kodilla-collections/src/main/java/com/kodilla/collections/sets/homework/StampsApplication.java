package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", "2x2 cm", true));
        stamps.add(new Stamp("Butterfly", "2x2 cm", true));
        stamps.add(new Stamp("Flower", "3x3 cm", true));
        stamps.add(new Stamp("Car", "4x2 cm", false));
        stamps.add(new Stamp("Building", "2x2 cm", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
