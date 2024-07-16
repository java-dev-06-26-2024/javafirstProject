package com.learning.day2;

public class LoopStatements {
    public static void main(String[] args) {

        // for
        // while
        // do while

//        for(start, condition; updating){
//            //coding repeat
//        }


        for(int i =0; i< 10; i++){
            System.out.println(i);
        }

        for(int i =0; i< 10; i++){
            System.out.print(i);
        }


        // write a code for 39, 41, 43 ...... 150.
        // print all values and check if any value is divisible by 5, if it does then print this is divisible by 5.

        for(int i =39; i <=150; i= i+2){
            if(i % 5 == 0){
                System.out.println( i + " is divisible by 5.");
            }else{
                System.out.println(i);
            }
        }


        // implement with while loop

        // start
        int j =39;
        while(j <=150){
            if(j % 5 == 0){
                System.out.println( j+ " is divisible by 5.");
            }else{
                System.out.println(j);
            }

            j=j+2;
        }



        // do while

        do{
            if(j % 5 == 0){
                System.out.println( j+ " is divisible by 5.");
            }else{
                System.out.println(j);
            }

            j=j+2;
        }while(j<150);



        // nasted loops => loop inside a loop


        for (int i = 0; i< 5; i++){
            System.out.println(i + "outer loop");
            for (int k=10; k <15; k++){
                System.out.println(k);
            }
        }




        // Pattern programming
//          0 1 2 3 4
//        0 * * * * *
//        1 * * * * *
//        2 * * * * *
//        3 * * * * *
//        4 * * * * *

        for (int i=0; i<5; i++){
            for (int k=0; k<5; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
//          0 1 2 3 4
//        0 * * * * *
//        1 * * * *
//        2 * * *
//        3 * *
//        4 *

        System.out.println("---------------");

        for (int i=0; i<5; i++){
            for (int k=5-i; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
//          0 1 2 3 4
//        0 *          : i+1
//        1 * *
//        2 * * *
//        3 * * * *
//        4 * * * * *

        System.out.println("---------------");
        for (int i=0; i<5; i++){
            for (int k=0; k<i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // 1. Write a Java program that takes an integer as input and prints whether the number is positive, negative, or zero using if-else conditions.
        // 2. Write a Java program to check if a given number is odd or even using if-else conditions.
        // 3. Write a Java program that takes a score (0-100) as input and prints the corresponding grade using if-else conditions. For example:
        //    90-100: A
        //    80-89: B
        //    70-79: C
        //    60-69: D
        //     0-59: F
        // 4. Write a Java program that takes the lengths of three sides of a triangle as input and determines
        //           if the triangle is equilateral, isosceles, or scalene using if-else conditions.
//          5. Write a Java program that takes an integer as input and classifies it into one of the following categories using if-else conditions:
//              Positive and even
//              Positive and odd
//              Negative and even
//               Negative and odd
//                Zero

//        6. Write a Java program that takes an integer N as input and calculates the sum of the first N natural numbers using a while loop.
//        7. Write a Java program that takes an integer as input and prints its multiplication table up to 10 using a for loop.
//        8. Write a Java program to print all prime numbers between 1 and 100 using a for loop and nested loops.

    }
}
