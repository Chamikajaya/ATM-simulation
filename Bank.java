package com.atm.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;
    private Map<String, List<Transaction>> transactions;

    public Bank() {
        accounts = new HashMap<>();
        transactions = new HashMap<>();
    }
    /*This method adds an Account object to the accounts map.
    Also I used  account number as  the key to store the account object (value).*/
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    /*
    * This method returns an Account object related  to the given account number.
    I used the account number as the key to get back  the account object from the accounts map.
    * */
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    /*
     Adds a Transaction object to the transactions map.
    I used  account number  as the key to store a list of transactions associated with particular account.
      */
    public void addTransaction(String accountNumber, Transaction transaction) {
        List<Transaction> accountTransactions = transactions.getOrDefault(accountNumber, new ArrayList<>());
        accountTransactions.add(transaction);
        transactions.put(accountNumber, accountTransactions);
        transaction.completeTransaction(true);
    }

    public List<Transaction> getTransactions(String accountNumber) {
        return transactions.getOrDefault(accountNumber, new ArrayList<>());
    }
}
