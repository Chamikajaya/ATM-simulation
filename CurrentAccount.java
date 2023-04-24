package com.atm.bank;

public class CurrentAccount extends Account {
    private double overdraftLimit; // Max amount which the user can borrow if his balance is not enough to perform his transaction

    public CurrentAccount(String accountNumber, String currency, String branch, double balance, double overdraftLimit) {
        super(accountNumber, currency, branch, balance);
        this.overdraftLimit = overdraftLimit; // Set the overdraft limit for the account
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) { // Check if the amount to withdraw is below maximum   overdraft limit
            balance -= amount;
            return true;
        }
        return false;
    }
}
