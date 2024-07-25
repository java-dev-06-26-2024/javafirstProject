package com.learning.day6and7;

public class FourPillersOfJava {

    public static void main(String[] args) {


//            1. Encapsulation
//            2. Inheritance
//            3. Polymorphism
//            4. Abstraction


//             1. Encapsulation

//             Encapsulation is to make sure that "Sensitive Data" is hidden from the users.
//             1. declare class variables/ attributes as private.
//             2. we will create a set or get methods to access or update the values of attributes.

        //      Create one Student Class implementing Encapsulation.
        //      step 1: creating class.
        //      step 2: create attributes.
        //      step 3: make attribute private.
        //      step 4: create set and get methods for the attributes.
        //      hint: when we are creating set method we will take an input from the user.
        //      hint: when we are creating get method we will return the attribute value.



//               2. Inheritance
//               its possible to inherit attributes and methods from one class to Another Class.
//               To inherit from one class to another class, we will use a keyword "extends".
//               1. subclass or child class -> classes that inherits from [another class] <-(this will be the parent class or super class for that particular child or subclass)
//               2. super class or parent class ------------------------------------------>




                 //  "super" keyword is used to access the parent methods or attributes.

                //   For all the objects in java, parent class is "Object" Class that is created by Java

//            Types of Inheritance:        inherits
//            1. Single Inheritance :  B -------------> A

                   B b1 = new B();
//                                                   inherits         inherits
//            2. Multi - level Inheritance :    C ------------> B ---------------> A
//                                               proMax ------------------>iphone -------------> phone
//                                               pro --------------------->iphone -------------> phone
//                                               mini--------------------->iphone -------------> phone
//                                                                         android-------------> phone
//  ----------------------------------------------------------------------------------------------------------
//  //                                              xyz ------------------>WaterTree -------------> Tree
////                                               abc --------------------->WaterTree -------------> Tree
////                                               mini--------------------->WaterTree -------------> Tree
//                                                       --------------------->LandTree -------------> Tree
//   ----------------------------------------------------------------------------------------------------------
//                                                 DuplexApartment      ------------------>Apartment -------------> Building
////                                                PentHouseApartment--------------------->Apartment -------------> Building
////                                               XyzApartment        --------------------->Apartment -------------> Building
////                                                          FarmHouse --------------------->  House-------------> Building
//        ////                                                TownHouse --------------------->  House-------------> Building

        C c1 = new C();

//             3. Multiple Inheritance:        C  -----------------> A  Father   // does not supported by Java Classes
//                                             C  -----------------> B  Mother

//              4. Hierarchical Inheritance:

//              5. Hybrid Inheritance:  (Hierarchical Inheritance   +   Multiple Inheritance);   // / does not supported by Java Classes


            Person person = new Person();
            person.setId(1);
            person.setName("xyz");
            person.setAddress("sadfghjkl;");



            Student student1 = new Student();
            student1.setId(2);
            student1.setName("Joy");
            student1.setAddress("Sterling");
            student1.setGrade(3.5);


            Teacher teacher1 = new Teacher();
            teacher1.setId(3);
            teacher1.setName("Roy");
            teacher1.setAddress("Vienna");
            teacher1.setSubjectName("Full stack java");
            teacher1.setSalary(1200);

//            3. Polymorphism    => Many forms
//            Poly    => many
//            morphism =>forms


        //   operation :   add   + (int int)
//                               int int int
//                             double double double


//         1. Compile time Polymorphism => Method Overloading
//         2. Runtime Polymorphism   => method Overriding.


//         1. Method Overloading.
//          method name -> same
//          different number of parameters  with same datatypes
//          different datatypes with same number of parameters.
//          within same Class (single class)

//        2. Method Overriding
//          method name -> same
//         Method Overriding will be used when there are two classes having Inheritance relationship
//         and both are having same method with different implementation.
//         @Override


//        4. Abstraction
//         is a process of hiding the certain details and showing only essential information to user.
//        Abstraction -> hiding the implementation.

        // 1. using private methods.
        // 2. Abstract Classes
        // 3. Interfaces


        // homework - july 24th
        //   2 Examples - Inheritance Examples
        //   2 Examples - Polymorphism - Method Overloading.
        //   2 Examples - Polymorphism - Method Overriding.
        //   1 Examples - Abstraction using private methods.


//        what is abstract class ?
//        we will use a keyword "abstract".
//        Abstract methods can only be created inside a abstract class
//        Abstract Classes can have both regular methods and Abstract methods.
//        Whatever class that is extending from abstract class need to provide the implementation for abstract methods.

//        what abstract method ?
//        we will use a keyword "abstract".
//        abstract methods will not have a body.



//        what is Interface ?
//        this is another way to achieve abstraction.
//        An Interface is a completely Abstract Class, means only Abstract methods are allowed.
//             to access the interface methods, the interface must be implemented by another class.
//        we use the keyword "implements".

//        Rules :
//        Interfaces can not be used to create Objects.
//        Interfaces can only have abstract methods.
//        Whatever class that is implementation the interface need to provide the implementation for abstract methods.
//        In interface by default all the methods are public.
//        In Interface, we can not contain a constructor.
//        In Interface, attributes are public and static and final.




    }
}
