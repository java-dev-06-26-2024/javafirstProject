package com.learning.day3and4;

public class JumpingStatements {

    public static void main(String[] args) {
        //  break ;   -> to stop the loop
        //  continue; -> to skip current iteration of the loop


        for(int i=0; i <100; i++){
               if(i==28){
                   System.out.println(i);
               }

               if( i ==72){
                   System.out.println(i);
                   break;
               }
        }


       for( int i =1; i<20; i++){
           if( i  % 2 == 0){
               System.out.println("skipped");
               continue;
           }
           System.out.println(i);
       }





    }
}
