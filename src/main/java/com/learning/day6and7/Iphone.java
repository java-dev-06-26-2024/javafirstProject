package com.learning.day6and7;

public class Iphone extends Phone{

    String camera1;
    String camera2;

    @Override
    public void camera() {
        System.out.println("taking a pictute using :"+ camera1 +" "+ camera2);
    }
}
