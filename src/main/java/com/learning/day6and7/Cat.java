package com.learning.day6and7;

public class Cat  extends  Animal{

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void moving() {
        System.out.println("walking");
    }
}
