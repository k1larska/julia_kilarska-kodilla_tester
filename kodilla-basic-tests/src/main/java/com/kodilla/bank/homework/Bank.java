package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int cashMachinesCount;

    public Bank() {
        this.cashMachines = new CashMachine[100];
        this.cashMachinesCount = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        if (cashMachinesCount < cashMachines.length) {
            cashMachines[cashMachinesCount] = cashMachine;
            cashMachinesCount++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę bankomatów.");
        }
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < cashMachinesCount; i++) {
            totalBalance += cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawalsCount() {
        int withdrawalsCount = 0;
        for (int i = 0; i < cashMachinesCount; i++) {
            withdrawalsCount += getWithdrawalsCountFromCashMachine(cashMachines[i]);
        }
        return withdrawalsCount;
    }

    public int getTotalDepositsCount() {
        int depositsCount = 0;
        for (int i = 0; i < cashMachinesCount; i++) {
            depositsCount += getDepositsCountFromCashMachine(cashMachines[i]);
        }
        return depositsCount;
    }

    public double getAverageWithdrawal() {
        int withdrawalsCount = getTotalWithdrawalsCount();
        if (withdrawalsCount > 0) {
            int withdrawalsSum = 0;
            for (int i = 0; i < cashMachinesCount; i++) {
                withdrawalsSum += getWithdrawalsSumFromCashMachine(cashMachines[i]);
            }
            return (double) withdrawalsSum / withdrawalsCount;
        } else {
            return 0;
        }
    }

    public double getAverageDeposit() {
        int depositsCount = getTotalDepositsCount();
        if (depositsCount > 0) {
            int depositsSum = 0;
            for (int i = 0; i < cashMachinesCount; i++) {
                depositsSum += getDepositsSumFromCashMachine(cashMachines[i]);
            }
            return (double) depositsSum / depositsCount;
        } else {
            return 0;
        }
    }

    private int getWithdrawalsCountFromCashMachine(CashMachine cashMachine) {
        int withdrawalsCount = 0;
        for (int i = 0; i < cashMachine.getTransactionsCount(); i++) {
            if (cashMachine.getTransactions()[i] < 0) {
                withdrawalsCount++;
            }
        }
        return withdrawalsCount;
    }

    private int getDepositsCountFromCashMachine(CashMachine cashMachine) {
        int depositsCount = 0;
        for (int i = 0; i < cashMachine.getTransactionsCount(); i++) {
            if (cashMachine.getTransactions()[i] > 0) {
                depositsCount++;
            }
        }
        return depositsCount;
    }

    private int getWithdrawalsSumFromCashMachine(CashMachine cashMachine) {
        int withdrawalsSum = 0;
        for (int i = 0; i < cashMachine.getTransactionsCount(); i++) {
            if (cashMachine.getTransactions()[i] < 0) {
                withdrawalsSum += cashMachine.getTransactions()[i];
            }
        }
        return withdrawalsSum;
    }

    private int getDepositsSumFromCashMachine(CashMachine cashMachine) {
        int depositsSum = 0;
        for (int i = 0; i < cashMachine.getTransactionsCount(); i++) {
            if (cashMachine.getTransactions()[i] > 0) {
                depositsSum += cashMachine.getTransactions()[i];
            }
        }
        return depositsSum;
    }
}