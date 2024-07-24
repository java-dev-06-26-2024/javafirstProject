package com.learning.day5;

public class Phone {

    private String color;
    private String model;
    private String Os;
    private double price;


   // default constructor // if we dont provide any constructor, java will create one for us.
//   public Phone(){
//       System.out.println("Phone Object has been created.");
//   }


   public Phone(String color, String model, String Os, double price){
       this.color = color;
       this.model = model;
       this.Os = Os;
       this.price = price;
   }



    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void updateModel(String inputModel){
        model = inputModel;
    }

    public String getModel(){
        return model;
    }

    public void updateOs(String inputOs){
        Os = inputOs;
    }
    public String getOs(){
        return Os;
    }
    public void updatePrice(double inputPrice){
        price = inputPrice;
    }
    public double getPrice(){
        return price;
    }





}
