package com.learning.day11and12;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableVsComparator {

    public static void main(String[] args) {


        // Comparable                                                      Comparator
//        Comparable is interface => java.lang                  Comparator is also an Interface => java.Util
//        it is used to compare the current object              it is used to compare two objects.
//        with another object
//        compareTo().                                                  compare();


        Student s1 = new Student(1, 21, "adam", 3.5, 3);
        Student s2 = new Student(2, 35, "ana", 2.5, 2);
        Student s3 = new Student(3, 42, "joy", 1.8, 8);
        Student s4 = new Student(4, 18, "roy", 3.9, 1);
        Student s5 = new Student(5, 28, "jack", 0.8, 25);

        ArrayList<Student> students = new ArrayList<>();

        students.add(s3);
        students.add(s1);
        students.add(s5);
        students.add(s2);
        students.add(s4);

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students, new StudentAgeComparator());

        System.out.println(students);

        Collections.sort(students, new StudentRankComparator());

        System.out.println(students);



    }
}
