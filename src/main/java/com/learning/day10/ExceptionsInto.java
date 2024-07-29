package com.learning.day10;

import java.util.Scanner;

public class ExceptionsInto {

    public static void main(String[] args) {

        // Exceptions : abnormal termination of Program.

//        Types of Exceptions :
//             1. Checked Exceptions
//                         -> checked Exceptions can be checked at compile time, Extends the "Exception" class.
//                         -> methods that might throw a checked Exception must declare it in their "throws" clause.
//                         -> handle using try/ catch block.
//             2. Unchecked Exceptions
//                          -> not checked at compile time., Extends the "RuntimeException" class
//                          -> methods that might throw a unchecked Exception, no need to declare it in their "throws" clause.
//                          -> caught explicitly.

//         Ways to print Exception :
//         printStackTrace() : ExceptionClassName , message, location of Exception.
//         getMessage()  : message
//         directly print the exception : ExceptionClassName message


//           Exceptions Hierarchy:

//           Throwable -> Main Class
//           RuntimeException
//           IOExceptions
//           SQLExceptions
//           ClassNotFoundExceptions
//           ArrayIndexOutOfBoundExceptions
//           StringIndexOutOfBoundExceptions.

//        Exception Handling : Inorder to stop the abnormal termination of program, we use Exception Handling.
//                              try/Catch and finally.


//        Errors:
//        OutOfMemoryError.
//        StackOverFlowError.
//        VirtualMachineError.

//        Scanner s = new Scanner(System.in);
//        System.out.println("enter a value: ");
//         int a = s.nextInt();
//        System.out.println("enter b  value: ");
//         int b = s.nextInt();
//
//
//        try{
//            System.out.println("a/b : "+ a/b);  // risk code
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println("Exception Handled");
//        }
//
//        // final, finally, finalize
//
//
//        System.out.println("Next code");
//
//        System.out.println("a+b: "+ (a+b));
//

      ATM atmObj = new ATM();
     try{
         atmObj.withdraw(2000);
     }catch (MinBalanceException | MaxBalanceException e){
         System.out.println(e.getMessage());
     }





    }
}
