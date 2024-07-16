package com.learning.day2;

public class ConditionalStatements {

    public static void main(String[] args) {

        // conditional statements :
//              if
//              else
//              else if
//              switch

             boolean condition = false;

             if(condition){
                 System.out.println(" this block of code will print if condition is true");
             } else {
                 System.out.println(" this block of code will print if condition is false");
             }


             // write a logic to check given person is a senior citizen or not
             // person age grater than 50  => senior citizen

              int age = 25;

             if( age > 50 ){
                 System.out.println(" This is senior citizen  ");
             }else{
                 System.out.println(" This is not senior citizen  ");
             }


        // write a logic to check given person is a senior citizen or not
        // person age grater than 50  => senior citizen
        // person age is lessthan 20 => teenagers
        // person age is grater than 20 and less than 50 => youngster

        int personAge = 65;
              if( personAge > 50 ){
                  System.out.println(" This is senior citizen  ");
              } else if(personAge >=  20 && personAge < 50 ){
                  System.out.println(" This is youngster  ");
              } else if( personAge < 20){
                  System.out.println(" This is teenagers  ");
              }




              // switch

//            switch(expression){
//                case 1:
//                    //code
//                    break;
//                case 2:
//                    //code
//                    break;
//
//                default:
//                    // default code
//                    break;
//            }

        int day = 25;

              switch(day){
                  case 1:
                      System.out.println("Monday");
                      break;
                  case 2:
                      System.out.println("Tuesday");
                      break;
                  case 3:
                      System.out.println("WednesDay");
                      break;
                  case 4:
                      System.out.println("Thursday");
                      break;
                  case 5:
                      System.out.println("Friday");
                      break;
                  case 6:
                      System.out.println("Saturday");
                      break;
                  case 7:
                      System.out.println("Sunday");
                      break;
                  default:
                      System.out.println("Invalid input");
                      break;
              }


              // write a logic for traffic Light using Switch

                String trafficLight = "";

              switch(trafficLight){

                  case "red":
                      System.out.println("Stop");
                      break;
                  case "green":
                      System.out.println("Go");
                      break;
                      case "yellow":
                          System.out.println("Slow down");
                          break;
                  default:
                      System.out.println("Invalid input");
              }



    }
}
