package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle");
        System.out.println("Area: " + circle.Area());
        System.out.println("Perimeter: " + circle.Perimeter());

        Square square = new Square(6);
        System.out.println("Square");
        System.out.println("Area: " + square.Area());
        System.out.println("Perimeter: " + square.Perimeter());

        Rectangle rectangle = new Rectangle(9, 7);
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
    }
}
