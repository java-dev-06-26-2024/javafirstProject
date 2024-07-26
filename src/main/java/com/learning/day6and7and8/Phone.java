package com.learning.day6and7and8;

public class Phone {



    // with Int Password

    public void signIn(int password){                                        // Int
     //logic
        System.out.println("signin with "+ password);
    }

    // with String Password
    public void signIn(String password){                                       // string
        //logic
        System.out.println("signin with "+ password);
    }

    // with face input
    public void signIn(String faceShape, double width, double height ){        //     String, double double
        //logic
        System.out.println("signin with "+ faceShape + " "+ width + " " + height);
    }

    // with fingerprint
    public void signIn( double width, double height, String fingerShape ){       //   double, double , String
        //logic
        System.out.println("signin with "+ fingerShape + " "+ width + " " + height);
    }

    public void camera(){
        System.out.println("talking picture");
    }
}
