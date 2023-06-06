package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void testTotalBalance() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine1.deposit(200);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.withdraw(75);
        cashMachine2.deposit(300);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(475, bank.getTotalBalance());
    }

    @Test
    public void testTotalWithdrawalsCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine1.deposit(200);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.withdraw(75);
        cashMachine2.deposit(300);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(2, bank.getTotalWithdrawalsCount());
    }

    @Test
    public void testTotalDepositsCount() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine1.deposit(200);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.withdraw(75);
        cashMachine2.deposit(300);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(3, bank.getTotalDepositsCount());
    }

    @Test
    public void testAverageWithdrawal() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine1.deposit(200);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.withdraw(75);
        cashMachine2.deposit(300);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(-62.5, bank.getAverageWithdrawal(), 0.001);
    }

    @Test
    public void testAverageDeposit() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.deposit(100);
        cashMachine1.withdraw(50);
        cashMachine1.deposit(200);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.withdraw(75);
        cashMachine2.deposit(300);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(200, bank.getAverageDeposit(), 0.001);
    }
}