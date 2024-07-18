package com.learning.day3and4;


public class Car {


    // Attributes -> model, color, millage, lights, noSeats, doors, mfgDate, price

           String model;
           String color;
            int millage = 0;
            String mfgDate;
   protected double price;
    int speed=0;
    static int noOfWheels = 5;

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

    // accelerate + 10

    public int accelerateBy10(){
          speed = speed + 10;
          return speed;
    }

    //  create a methods to get the Attribute Values.

    //   String model;
    public String getModel(){
        return model;
    }

   //    String color;
    public String getColor(){
        return color;
    }


    // create method that takes a inputSpeed, its update the curentSpeed.


    // void type
    public void changeSpeed( int inputSpeed){
        speed =  inputSpeed;
    }
    // return type
    public int changeSpeedByReturnType( int inputSpeed){
        speed =  inputSpeed;  // business logic

        // end of logic
        return speed;
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
