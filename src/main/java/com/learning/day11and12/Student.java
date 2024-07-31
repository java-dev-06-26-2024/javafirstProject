package com.learning.day11and12;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private int id;
    private int age;
    private String name;
    private double gpa;
    private int rank;

    public Student(int id, int age, String name, double gpa, int rank) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gpa = gpa;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(gpa, student.gpa) == 0 && rank == student.rank && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Double.hashCode(gpa);
        result = 31 * result + rank;
        return result;
    }


    @Override
    public int compareTo(Student anotherStudent) {
        return this.id - anotherStudent.id;
    }
}
