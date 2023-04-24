package com.atm.bank;

import java.util.ArrayList;

public class Client {
    private String id;
    private String name;
    private String nationality;
    private String occupation;
    private String address;
    private int age;
    private String gender;
    private String pin;
    private ArrayList<Account> accounts; //This list will store the accounts related to a particular customer
    private ArrayList<Loan> loans;  // This list contains details about the loans taken by a specific customer

    // constructor to create a new client
    public Client(String id, String name, String nationality, String occupation, String address, int age, String gender) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.pin = "";
        this.accounts = new ArrayList<>();  // create an empty list of accounts for the client
        this.loans = new ArrayList<>();  // // create an empty list of loans for the client
    }
    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    // method to add an account to the list of accounts for a specific client user

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }
}

