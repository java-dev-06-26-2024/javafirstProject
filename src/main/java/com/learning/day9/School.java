package com.learning.day9;

public class School {

    private int schoolId;
    private String schoolName;
    private int noOfStudents;
    private double schoolRating;
    private double schoolFee;
    private  int noOfTeachers;

    public School(int schoolId, String schoolName, int noOfStudents, double schoolRating, double schoolFee, int noOfTeachers) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.noOfStudents = noOfStudents;
        this.schoolRating = schoolRating;
        this.schoolFee = schoolFee;
        this.noOfTeachers = noOfTeachers;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public double getSchoolRating() {
        return schoolRating;
    }

    public void setSchoolRating(double schoolRating) {
        this.schoolRating = schoolRating;
    }

    public double getSchoolFee() {
        return schoolFee;
    }

    public void setSchoolFee(double schoolFee) {
        this.schoolFee = schoolFee;
    }

    public int getNoOfTeachers() {
        return noOfTeachers;
    }

    public void setNoOfTeachers(int noOfTeachers) {
        this.noOfTeachers = noOfTeachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", noOfStudents=" + noOfStudents +
                ", schoolRating=" + schoolRating +
                ", schoolFee=" + schoolFee +
                ", noOfTeachers=" + noOfTeachers +
                '}';
    }
}
