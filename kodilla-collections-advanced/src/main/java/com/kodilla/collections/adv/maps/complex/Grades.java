package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades) {
        this.grades = grades;
    }
    Grades johnGrades = new Grades(Arrays.asList(5.0, 4.0, 3.5, 5.0));
    Grades jessieGrades = new Grades(Arrays.asList(2.5, 3.0, 2.0));
    Grades bartGrades = new Grades(Arrays.asList(4.0, 4.0, 4.0, 4.0, 5.0));


    public double getAverage() {    // [1]
        double sum = 0.0;            // [2]
        for (double grade : grades)  // [3]
            sum += grade;             // [4]
        return sum / grades.size();  // [5]
    }
    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
}
