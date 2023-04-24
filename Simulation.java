package com.atm.bank;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        System.out.println("Welcome to ABC bank");
        Bank bank = new Bank();
        ATM atm = new ATM(bank);
        Client client1 = new Client("C001", "John", "USA", "Software Developer", "12th Avenue, LA", 30, "Male");
        Account account1 = new Account("A001", "Checking", "Main",10000);
        client1.addAccount(account1);
        bank.addAccount(account1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account number : ");
        String accountNumber = scanner.nextLine();
        double amount;
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is " + atm.seeBalance(accountNumber));
                    break;
              
                case 2:
                    System.out.println("Please enter the amount to withdraw:");
                    amount = scanner.nextDouble();
                    if (atm.withdraw(accountNumber, amount)) {
                        System.out.println("Withdrawal successful. Your new balance is " + atm.seeBalance(accountNumber));
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Please enter the amount to deposit:");
                    amount = scanner.nextDouble();
                    atm.deposit(accountNumber, amount);
                    System.out.println("Deposit successful. Your new balance is " + atm.seeBalance(accountNumber));
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
