package com.learning.kulsoom;

import java.util.Objects;

public class Student {
//    name id grade address

    private int id;
    private String name;
    private double grade;
    private String address;

    public Student(){

    }

    public Student(int id, String name, double grade, String address) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Double.hashCode(grade);
        result = 31 * result + Objects.hashCode(address);
        return result;
    }
}
