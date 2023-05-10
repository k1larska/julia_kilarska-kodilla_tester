package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }
}
