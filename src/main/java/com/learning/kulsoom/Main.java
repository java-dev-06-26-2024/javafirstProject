package com.learning.kulsoom;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("kulsoom");
        s1.setGrade(2.5);
        s1.setAddress("sterling, va");

        System.out.println(s1);

        Student s2 = new Student();

        s2.setId(1);
        s2.setName("kulsoom");
        s2.setGrade(2.5);
        s2.setAddress("sterling, va");

        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }


}
