package com.atm.bank;

import java.time.LocalDateTime;

public class Transaction {
    private static int nextId = 1;

    private int id;
    private String accountId;
    private LocalDateTime date;
    private double amount;
    private String status;
    // Constructor

    public Transaction(String accountId, double amount) {
        this.id = nextId++;
        this.accountId = accountId;
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.status = "Please Wait, still processing";
    }
    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void completeTransaction(boolean success) {
        if (success) {
            setStatus("SUCCESS");
        } else {
            setStatus("FAILED");
        }
    }
}
