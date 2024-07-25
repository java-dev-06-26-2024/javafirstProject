package com.learning.day6and7;

public class Fish extends Animal{
    @Override
    public void sound() {
        System.out.println("bob");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void moving() {
        System.out.println("swimming");
    }
}
