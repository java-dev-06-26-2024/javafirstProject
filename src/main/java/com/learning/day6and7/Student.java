package com.learning.day6and7;

public class Student extends Person  {

    private double grade;

    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
      this.grade = grade;

    }


    @Override
    public String toString() {
        return "Name : "+ this.getName()+ " Id : "+this.getId()+" Grade : "+this.getGrade()+" Address : "+this.getAddress();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student sObj = (Student) obj;
            return  this.getId() == sObj.getId() && this.getName() == sObj.getName() && this.getGrade() == sObj.getGrade() && this.getAddress() == sObj.getAddress();
        }
        return false ;
    }
}
