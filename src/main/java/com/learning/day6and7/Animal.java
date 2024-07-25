package com.learning.day6and7;

public  abstract class Animal {
    String name;

    public abstract void sound();

    public abstract void eat();


    public abstract void moving();


    public void info(){
        System.out.println("This is a "+ name);
    }
}
