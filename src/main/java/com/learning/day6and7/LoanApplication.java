package com.learning.day6and7;

public class LoanApplication {
   final String BANK_NAME = "ABC Bank";
    private double loanAmount;
    private String name;
    private  String ssn;
    private  double income;
    private  double expense;

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double calculateRate(){
             double rate1= this.calculateRateBasedOnCreditScore();
             double rate2 = this.calculateRateBasedOnIncomeAndExpense(this.income, this.expense);
        return rate1+rate2/2;
    }


    private double getCreditScore(String SSN){
        // logic
        return 760;
    }

    private double calculateRateBasedOnIncomeAndExpense(double income, double expense){
        return 7.5;
    }

    private double calculateRateBasedOnCreditScore(){
        double creditScore = this.getCreditScore(this.ssn);

//        double rate = creditScore / this.loanAmount;   logic
        return  7.5;
    }





}
