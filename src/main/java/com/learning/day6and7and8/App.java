package com.learning.day6and7and8;

public class App {
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.add(2, 4);
        calc.add(2,3,4);
        calc.add(1.2,3.4,5.6);


      Father f1= new Father();
      Child c1 = new Child();

      f1.style();
      c1.style();

        Phone phone1 = new Phone();
        phone1.signIn("12aWBaCy%@2024");
        phone1.camera();

      Iphone iphone1 = new Iphone();
      iphone1.camera1 = "25MP";
      iphone1.camera2 = "8MP";
      iphone1.camera();

      ProMax proMax1 = new ProMax();
      proMax1.camera1 = "15Mp";
      proMax1.camera2 = "12MP";
      proMax1.camara3 = "8Mp";
      proMax1.camera();

//      LoanApplication

        LoanApplication la = new LoanApplication();
        la.setLoanAmount(50000);
        la.setExpense(1000);
        la.setIncome(6000);
        la.setSsn("98765432");
        la.setName("Rayn");
        System.out.println(la.calculateRate());
        System.out.println(la.BANK_NAME);


        RoboDog d1 = new RoboDog();
        d1.info();
        System.out.println( d1.kind);
        System.out.println(RoboDog.kind);

        RoboDog c2 = new RoboDog();
        c2.play();
        Animal f2 = new Fish();

    }
}
