package com.learning.day6and7and8;

public class RoboDog extends Animal implements AnimalImpl, BirdsImpl, FishImpl {


    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }


    @Override
    public void moving() {
        System.out.println("walking");
    }

    public void play(){
        System.out.println("play");
    }

    @Override
    public void fly() {
        System.out.println("Its flying");
    }

    @Override
    public void swim() {
        System.out.println("Its swimming");
    }
}
