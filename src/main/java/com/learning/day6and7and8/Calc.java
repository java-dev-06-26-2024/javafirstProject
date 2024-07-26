package com.learning.day6and7and8;

public class Calc {



    //   operation :   add     + (int int)
//                               int int int
//                             double double double

    //         1. Method Overloading.
//          method name -> same
//          different number of parameters  with same datatypes
//          different datatypes with same number of parameters.
//          within same Class (single class)

    public void add(int a, int b){
        System.out.println(a+b);
    }


    public void add(double a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(double a, double b, double c){
        System.out.println(a+b+c);
    }
}
