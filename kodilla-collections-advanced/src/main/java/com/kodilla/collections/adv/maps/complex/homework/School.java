package com.kodilla.collections.adv.maps.complex.homework;

import java.util.List;

public class School {
    private String name;
    private List<Integer> studentCounts;

    public School(String name, List<Integer> studentCounts) {
        this.name = name;
        this.studentCounts = studentCounts;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStudentCounts() {
        return studentCounts;
    }
}
