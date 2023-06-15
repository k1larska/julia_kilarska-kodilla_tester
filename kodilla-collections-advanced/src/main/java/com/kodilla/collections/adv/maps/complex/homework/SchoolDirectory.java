package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Principal principal1 = new Principal("John Smith");
        Principal principal2 = new Principal("Mary Johnson");

        List<Integer> school1StudentCounts = new ArrayList<>();
        school1StudentCounts.add(100);
        school1StudentCounts.add(150);
        School school1 = new School("ABC School", school1StudentCounts);

        List<Integer> school2StudentCounts = new ArrayList<>();
        school2StudentCounts.add(200);
        school2StudentCounts.add(250);
        school2StudentCounts.add(180);
        School school2 = new School("XYZ School", school2StudentCounts);

        Map<Principal, School> schoolMap = new HashMap<>();
        schoolMap.put(principal1, school1);
        schoolMap.put(principal2, school2);

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            List<Integer> studentCounts = school.getStudentCounts();

            System.out.println("Principal: " + principal.getName());
            System.out.println("School Name: " + school.getName());
            System.out.println("Total Students: " + calculateTotalStudents(studentCounts));
            System.out.println();
        }
    }

    private static int calculateTotalStudents(List<Integer> studentCounts) {
        int totalStudents = 0;
        for (int count : studentCounts) {
            totalStudents += count;
        }
        return totalStudents;
    }
}
