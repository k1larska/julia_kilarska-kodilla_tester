package com.kodilla.abstracts.homework;

public class Application2 {
    public static void main(String[] args) {
        Person person1 = new Person("Anne", 38, new Teacher());
        person1.displayResponsibilities();

        System.out.println();

        Person person3 = new Person("Adam", 23, new TaxiDriver());
        person3.displayResponsibilities();

        System.out.println();

        Person person2 = new Person("Emily", 45, new Doctor());
        person2.displayResponsibilities();

        System.out.println();
    }
}
