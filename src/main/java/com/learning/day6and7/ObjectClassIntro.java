package com.learning.day6and7;

public class ObjectClassIntro {

    public static void main(String[] args) {

// its a root or parent class for all the objects that are created inside a java.

        Object obj = new Object();

        Student s1 = new Student();
         s1.setName("Roy");
         s1.setId(1);
         s1.setGrade(3.5);
         s1.setAddress("Sterling, VA");

        System.out.println(s1);

        Student s2 = new Student();
        s2.setName("Roy");
        s2.setId(1);
        s2.setGrade(3.5);
        s2.setAddress("Sterling, VA");

        System.out.println(s2.equals(s1));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());


//        - toString();
//               -> It will return the String representation of Object.
//        - equals(Object obj):
//               -> It will be used to indicate weather some other object is equal or not to current object.
//                -> by default itr will check weather both belongs to same memory location or not.
//              ==      => shallow comparison
//             equals() => deep comparison
//        - hashcode();
//                -> it will return the hash code values of Object.
//        - getClass();
//                ->it provides the information about the class.
//        -clone();
//               ->it will used to create the new copy of the object and return it.
//       - finalize();
//             -> it will be called by garbage collector on object when garbage collector determines that
//                there are no more references to that Object.




        //   Product   -> id, name , price, rating  - > Abstract class
        //		             -> checkTotalSales() - > this is a normal method
        //----------------------------------------------------------------
        //   Laptop   -- > screenSize, RAM, SSD, processer
        //		             -> checkCharging(),   checkLogin()

        //------------ phase 2
        //		             -> constructor
        //		             -> Override the default toString to print the Object
        //		                 with id, name , price,  screenSize, RAM, SSD, processer

        //-------------- phase 3
        //                     -> Override the default equals to compare two Objects
        //		                 compression condition    id, ram, ssd, processor needs to be same to be equal
        //----------------------------------------------------------------
        //   Table   -- >    height, width, length
        //		             -> area method, volumn method

        //-----------------------------------------phase 2
        //                   -> constructor
        //		             -> Override the default toString to print the Object
        //		                 with id, name , price,  height, width, length

        //----------------------------------------- phase 3
        //                     -> Override the default equals to compare two Objects
        //		                 compression condition    id, length, height, width needs to be same to be equal
        //----------------------------------------------------------------
        //    Light  ->  wats, lumens
        //                   -> noOfAmps,  checkPowerUTil

        //-----------------------------------------phase 2
        //                   -> constructor
        //                   -> Override the default toString to print the Object
        //		                 with id, name , price,  wats, lumens

        //----------------------------------------- phase 3
        //                     -> Override the default equals to compare two Objects
        //		                 comparession condition    id, wats, lumens  needs to be same to be equal

        // create getters and setters -Product, Laptop,Table, Light

        // min 2 object of each.





    }
}
