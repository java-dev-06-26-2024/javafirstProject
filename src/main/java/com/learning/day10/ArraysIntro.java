package com.learning.day10;

public class ArraysIntro {

    public static void main(String[] args) {
//        length of An Array will be determined when you are creating array.
//        Once an array is created with length, then you can not modify it.
//        Arrays length is fixed.
//        same datatype can only be stored .
//         it will give you certain methods to do certain actions.

//        size(length) =6 , starting all are empty positions.
//        dataType[]  arrayVariableName = new dataType[size];
             int[]       numbers        = new   int [6];

//          Last position value = size -1 or length -1;

          numbers[0] = 1000;
          numbers[1] = 200;
          numbers[3] = 560;
          numbers[4] = 250;
          numbers[2] = 160;
          try {
              numbers[10] = 120;
          }catch (Exception e){
              System.out.println(e.getMessage());
          }


        System.out.println(numbers);

        for (int i : numbers){
            System.out.println(i);
        }

        for( int index = 0; index <  numbers.length ; index++){
            System.out.println(numbers[index]);
        }


        numbers[0] =1;
        System.out.println(numbers[0]);
//    size(length) =6 , starting all are positions with values.

//       datatype[]   arrayVariableName = {  elements };
           int[]           numbers1     =  { 200, 300, 400, 500, 600, 700 };

        System.out.println(numbers1[0]);
        System.out.println(numbers1.length);




    }
}
