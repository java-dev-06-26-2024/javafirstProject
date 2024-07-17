package com.learning.day3;


public class Car {


    // Attributes -> model, color, millage, lights, noSeats, doors, mfgDate, price

    String model;
    String color;
    int millage = 0;
    String mfgDate;
    double price;

// drive(), stop(), accelerate(), decelerate().


    public void drive(){
        System.out.println("My car is drive mode");
    }

    public void stop(){
        System.out.println("My car is stop mode");
    }

    public  void accelerate(){
        System.out.println("My car is accelerate mode");
    }

    public void decelerate(){
        System.out.println("My car is decelerate mode");
    }

    //        Each Class create 3 Objects.
    // Laptop       Attributes -> OS, price, rating, processor, ram , screenSize
//                       Methods ->   switchOn(), switchOff(), openApp(), closeApp().

//         House         Attributes -> houseType, noOfBedRooms, noOfBathrooms, location, price, isItInCity
//                       Methods    -> enter(), sold(), rent().


//         Phone         Attributes -> screenSize, batterLife, memorySize, color, price, model, ram, brand, camera.
//                       Methods    -> calling(), texting(), playMusic(), playVideo(), chargePhone(), turnOff(), turnOn().
//                                        volumeUp(), volumeDown().



}
