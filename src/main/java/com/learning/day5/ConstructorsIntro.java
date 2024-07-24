package com.learning.day5;

public class ConstructorsIntro {

    public static void main(String[] args) {


        // Special method that is used to initialise(build) the objects.
        // By default, constructor method will be called when an object of class is created.
        //

        // Rules :
        // 1. it has to use the Class name as same as constructor name.
        // 2.  no return type and no return statement.
        // 3.  Almost all the cases we will make it public.

        // default constructor

//     public  ClassName(){
//
//
//     }

//         Phone phone1 = new Phone();
//        phone1.updateColor("red");
//        phone1.updateModel("15 Pro");
//        phone1.updateOs("IOS");
//        phone1.updatePrice(1200.50);

//        System.out.println(phone1.getColor());

//        Phone phone2 = new Phone();
//        phone2.updateColor("blue");
//        phone2.updateModel("13 Mini");
//        phone2.updateOs("IOS");
//        phone2.updatePrice(600.50);


        // parametrized constructor

//        public ClassName( datatype parameterName){
//
//        }

        Phone phone1 = new Phone("red", "15 Pro", "IOS", 1200.50);

        Phone phone2 = new Phone("blue", "13 Mini", "IOS", 600.50);



        // Keyword : "this"
        // this keyword refers to the current Object(itself) in a method or constructor.
        // -> "this" keyword is used to eliminate the confusion between attributes and input parameters.


        // Weekend Homework.
        //  1. Write a Java program to find the largest among three numbers.
        //  2. Write a Java program to check if a character is a vowel or consonant
        //  3. Write a Java program to determine if a person is eligible to vote based on their age
        //  4. Write a Java program to calculate the factorial of a number using a while loop
        //  5. Write a Java program to find the sum of all even numbers between 1 and 100 using a for loop

         // 6. Define a class called Student with attributes name, age, and grade. Create a constructor to initialize
        //      these attributes and a method to display the student's details.
        //   7. Create a class Rectangle with attributes length and breadth. Write methods to calculate the area and perimeter
        //       of the rectangle. Create objects of the class and test the methods.
        //   8. Create a class BankAccount with attributes accountNumber, balance, and methods to deposit and withdraw money.
        //       Write a program to test these methods.
        //   9.  Write a class Product with attributes productId, name, and price. Include a parameterized constructor to initialize
        //       these attributes and a method to display the product details. Create multiple objects and display their details.
        //   10.  Book Class:
        //           Attributes: title (String), author (String), isbn (String), isAvailable (boolean)
        //           Constructors:
        //                   A parameterized constructor to initialize all the attributes.
        //             Methods:
        //                      getTitle(): Returns the title of the book.
        //                     getAuthor(): Returns the author of the book.
        //                       getIsbn(): Returns the ISBN of the book.
        //                   isAvailable(): Returns the availability status of the book.
        // setAvailability(boolean status): Sets the availability status of the book.
        //            displayBookDetails(): Prints the details of the book.


    }
}
