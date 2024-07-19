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


   public Phone(String inputColor, String inputModel, String inputOS, double inputPrice){
       color = inputColor;
       model = inputModel;
       Os = inputOS;
       price = inputPrice;
   }



    public void updateColor(String inputColor){
        color = inputColor;
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
