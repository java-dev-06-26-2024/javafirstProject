package com.learning.day11and12;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }
}
