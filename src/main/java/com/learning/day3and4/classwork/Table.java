package com.learning.day3and4.classwork;

public class Table {

       private double length = 10.5;
       private double width = 2.5;
       private double height = 1.5;


       public double getLength(){
           return  length;
       }

       public double getWidth(){
           return width;
       }

       public double getHeight(){
           return height;
       }

       public void updateLength(double inputLength){
           length = inputLength;
       }

       public void updateWidth(double inputWidth){
           width = inputWidth;
       }

       public void updateHeight(double inputHeight){

           height = inputHeight;
       }

}
