package com.atm.bank;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private Bank bank;

    // Constructor for the ATM class
    public ATM(Bank bank) {
        this.bank = bank;
    }

    // Method to check the validity
    public boolean validateAccount(String accountNumber) {
        return bank.getAccount(accountNumber) != null;
    }

    // Method to withdraw money from an account
    public boolean withdraw(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null && account.withdraw(amount)) { // If the account exists and there's enough balance to withdraw
            bank.addTransaction(accountNumber, new Transaction(accountNumber, amount)); // Add the transaction to the bank's transaction list
            return true;
        }
        return false;
    }

    // Method to deposit money into an account
    public boolean deposit(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) { // If the account exists
            account.deposit(amount); // Deposit the amount into the account
            bank.addTransaction(accountNumber, new Transaction(accountNumber, amount)); // Add the transaction to the bank's transaction list
            return true;
        }
        return false;
    }

    // Method to get the list of transactions for an account
    public List<Transaction> getTransactions(String accountNumber) {
        return bank.getTransactions(accountNumber);
    }

    // Method to see the balance of an account
    public double seeBalance(String accountNumber) {
        Account account = bank.getAccount(accountNumber);
        if (account != null){ // If the account exists
            return account.getBalance();
        }
        return 0;
    }
}
