package com.learning.day9;

import java.util.Scanner;

public class ScannerClass {

    // Scanner class is used to get the user input.

   // it's imported from java.util package

    public static void main(String[] args) {
        // Scanner Object will take the InputSource which System.in as input parameter.
        Scanner scan = new Scanner(System.in);
        // methods

        // String input : nextLine(); next();

        // Int input :    nextInt();

        // double input: nextDouble();

//IMP Note: Taking input from any Datatype other than String, we will use followup scan.nextLine(); statement.

        // build a code to get the person's details
        // name
        // age
        // phoneNumber
        // salary
        // dateOfBirth
        // address
        // email
        // isFinished

        System.out.println("Please enter your name :");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("Please enter your age :");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println(age);

        System.out.println("Please enter your phoneNumber :");
        int phoneNumber = scan.nextInt();
        scan.nextLine();
        System.out.println(phoneNumber);

        System.out.println("Please enter your Salary :");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println(salary);

        System.out.println("Please enter your dateOfBirth :");
        String dateOfBirth = scan.nextLine();
        System.out.println(dateOfBirth);

        System.out.println("Please enter your address :");
        String address = scan.nextLine();
        System.out.println(address);

        System.out.println("Please enter your email :");
        String email = scan.nextLine();
        System.out.println(email);

        System.out.println("Please enter your isFinished :");
        boolean isFinished = scan.nextBoolean();
        System.out.println(isFinished);
        scan.nextLine();


    }
}
