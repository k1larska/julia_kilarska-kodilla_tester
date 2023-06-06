package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int transactionsCount;

    public CashMachine() {
        this.transactions = new int[1000];
        this.transactionsCount = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions[transactionsCount] = amount;
            transactionsCount++;
        } else {
            System.out.println("Nieprawidłowa wartość wpłaty.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            transactions[transactionsCount] = -amount;
            transactionsCount++;
        } else {
            System.out.println("Nieprawidłowa wartość wypłaty.");
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < transactionsCount; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int getTransactionsCount() {
        return transactionsCount;
    }

    public int[] getTransactions() {
        return transactions;
    }
}