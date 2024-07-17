package com.learning.day3;

public class OOps {
    public static void main(String[] args) {


//         OOPS  => OBJECT ORIENTED PROGRAMMING
        // Main components
        // Class
        // Object



        // Class => What is a class ?
        // Class is a template or blueprint for creating objects.

//        Class  => 1. Attributes  => will hold data
//                  2. Methods     => modify the data or perform some actions.

        // Class        =>            Object

        // Car           =>       Toyota, Mazda, Volvo, Lexus
//            Attributes -> model, color, millage, lights, noSeats, doors, mfgDate, price
//            Methods    -> drive(), stop(), accelerate(), decelerate().

        // Fruit         =>       Apple, Orange, Grape
//------------------------------------------

        // how to create a Class ?

//        public class ClassName{
//              Attributes ->    dataType AttributeName = attributeValue;
//        }



        // how to write a simple method

//         public void methodName(){
//             // body of method
//        }

//        how to create a Object using class
//         we will use a keyword called "new" to create a Objects using  a Class


//         ClassName   objectName = new ClassName();

//          adding a value to attributes
//          objectName.attributesName = value;

//         calling a method
//         objectName.methodName();

        // Car           =>       toyota, mazda, tolvo, lexus

        Car toyota = new Car();   // different memory location
        toyota.color = "Green";
        toyota.mfgDate= "02-20-2024";
        toyota.millage = 20000;
        toyota.model = "camry";
        toyota.price = 25000.99;
        System.out.println(toyota.color);
        System.out.println(toyota.price);
        System.out.println(toyota.millage);

        toyota.drive();
        toyota.accelerate();
        toyota.decelerate();
        toyota.stop();

        Car lexus = new Car();    // different memory location



//        Each Class create 3 Objects.
        // Laptop       Attributes -> OS, price, rating, processor, ram , screenSize
//                       Methods ->   switchOn(), switchOff(), openApp(), closeApp().

//         House         Attributes -> houseType, noOfBedRooms, noOfBathrooms, location, price, isItInCity
//                       Methods    -> enter(), sold(), rent().


//         Phone         Attributes -> screenSize, batterLife, memorySize, color, price, model, ram, brand, camera.
//                       Methods    -> calling(), texting(), playMusic(), playVideo(), chargePhone(), turnOff(), turnOn().
//                                        volumeUp(), volumeDown().
//------------------------------------------------------------------------------------------------------------------------
//       Class => DataSheet          Attributes => companyName, noOfChecks, maxSalary, billId, price.
//                                    Methods   =>      openSheet(), closeSheet(), reportBasedOnData(), updateData()
//        Objects   => dialySheet, weeklySheet, monthlySheet
//------------------------------------------------------------------------------------------------------------------------

    }
}
