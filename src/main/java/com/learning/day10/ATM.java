package com.learning.day10;

public class ATM {

    public void withdraw(int money) throws MinBalanceException, MaxBalanceException {

        if(money < 100){
            throw new MinBalanceException("Min withdraw balance is 100$");
        }

        if(money > 500){
            throw new MaxBalanceException("Max withdraw balance is 500$");
        }
            System.out.println(money);

    }
}
