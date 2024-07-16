package com.learning.day2;

public class TypeCasting {

    public static void main(String[] args) {

//      2 types of TypeCasting  : Widening Casting
//                                Narrowing Casting

        // assign a value of primitive datatype to another datatype.


//        Widening Casting
//           byte -> short -> char -> int -> long -> float -> double

//        Narrowing Casting

//           double  -> float -> long -> int -> char -> short -> byte


        //        Widening Casting

        byte a = 120;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        short c = a;
        System.out.println(c);

        //        Narrowing Casting
        int number = 127;

        byte byteValue = (byte)number;

        System.out.println(byteValue);
        short shortValue = (short)number;

        float floatValue = 12.345f;

        int inValue = (int) floatValue;

        System.out.println(inValue);

        short shortValue2 = 4523;

        double doubleValue = shortValue2;

        System.out.println(doubleValue);

    }

}
