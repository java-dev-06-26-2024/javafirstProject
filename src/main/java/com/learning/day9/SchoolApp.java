package com.learning.day9;

import java.util.Scanner;

public class SchoolApp {

    public static void main(String[] args) {

        Scanner  scannerObj = new Scanner(System.in);

        System.out.println("-------------------------- Welcome to out School APP ---------------------");
        boolean stop = false;
        while(!stop){
            System.out.println("1: do you want to create a School ?");
            System.out.println("2: do you want to register? ");
            System.out.println("3: do you want to Exit ?");
            int option = scannerObj.nextInt();
            scannerObj.nextLine();

            if( option == 1){
//                private int schoolId;
//                private String schoolName;
//                private int noOfStudents;
//                private double schoolRating;
//                private double schoolFee;
//                private  int noOfTeachers;

                System.out.println("Enter the school Id :");
                int schoolId = scannerObj.nextInt();
                scannerObj.nextLine();


                System.out.println("Enter the school name :");
                String schoolName = scannerObj.nextLine();

                System.out.println("Enter the onOf students :");
                int noOfStudents = scannerObj.nextInt();
                scannerObj.nextLine();

                System.out.println("Enter the  school rating :");
                double schoolRating = scannerObj.nextDouble();
                scannerObj.nextLine();

                System.out.println("Enter the  school fee :");
                double schoolFee = scannerObj.nextDouble();
                scannerObj.nextLine();

                System.out.println("Enter the onOf teachers :");
                int noOfTeachers = scannerObj.nextInt();
                scannerObj.nextLine();


                School school1 = new School(schoolId, schoolName, noOfStudents, schoolRating, schoolFee, noOfTeachers);

                System.out.println(school1);


            }else if (option == 2){


//                private int id;
//                private String name;
//                private int age;

                System.out.println("Enter the User Id : ");
                int userId = scannerObj.nextInt();
                scannerObj.nextLine();

                System.out.println("Enter the User Name : ");
                String userName = scannerObj.nextLine();

                System.out.println("Enter the User age : ");
                int userAge = scannerObj.nextInt();
                scannerObj.nextLine();

                User user1= new User(userId, userName, userAge );

                System.out.println(user1);

            }else if(option == 3 ){
                // logic to exit;
                System.out.println("Exit");
                stop = true;
            }
        }


    }
}
