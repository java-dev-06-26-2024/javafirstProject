package com.learning.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp {

    public static void main(String[] args) throws InterruptedException {

//        School[] schools = new School[10];
//        int positionOfSchool =0;
        User[]   users = new User[10];
        int positionOfUser =0;

        ArrayList<School>  schoolArrayList = new ArrayList<>();

        Scanner  scannerObj = new Scanner(System.in);

        System.out.println("-------------------------- Welcome to out School APP ---------------------");
        boolean stop = false;
        while(!stop){
            System.out.println("1: do you want to create a School ?");
            System.out.println("2: do you want to register? ");
            System.out.println("3: show all schools");
            System.out.println("4: show all users");
            System.out.println("5: do you want to Exit ?");
            int option = scannerObj.nextInt();
            Thread.sleep(1000);
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


                School school = new School(schoolId, schoolName, noOfStudents, schoolRating, schoolFee, noOfTeachers);
//
//                if(positionOfSchool < schools.length){
//                   schools[positionOfSchool] = school;
//                   positionOfSchool++;
//                    System.out.println("School is successfully created...........!");
//
//                }else{
//                    System.out.println("Schools Arrays is filled, Please try again later.....");
//                }

                schoolArrayList.add(school);



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

                User user= new User(userId, userName, userAge );

                if(positionOfUser < users.length){
                    users[positionOfUser] = user;
                    positionOfUser++;
                    System.out.println("User is successfully created...........!");
                }else{
                    System.out.println("Users Arrays is filled, Please try again later.....");
                }


            }else if(option == 3){
                // logic to print all schools
                System.out.println("This is trail version 2 update...!");

                for (int index =0; index < schoolArrayList.size(); index++){
                    System.out.println(schoolArrayList.get(index));
                }

            }else if(option == 4 ){
                // logic to show/print all users;
               for (int index =0; index< positionOfUser; index++){
                   System.out.println(users[index]);
               }

            }
            else if(option == 5 ){
                // logic to exit;
                System.out.println("Exit");
                stop = true;
            }
        }


    }
}
