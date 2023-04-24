package com.atm.bank;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String currency, String branch, double balance, double interestRate) {
        super(accountNumber, currency, branch, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);  // Formula to calculate the added money
        deposit(interest);
    }
}

