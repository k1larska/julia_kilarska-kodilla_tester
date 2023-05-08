package com.kodilla.inheritance.homework;

public class OperatingSystemsTest {
    public static void main(String[] args) {
        OperatingSystems os1 = new OperatingSystems(2001);
        OperatingSystems os2 = new Windows(1985);
        OperatingSystems os3 = new MacOS(2001);

        os1.turnOn();
        os2.turnOn();
        os3.turnOn();

        os1.turnOff();
        os2.turnOff();
        os3.turnOff();
    }
}

