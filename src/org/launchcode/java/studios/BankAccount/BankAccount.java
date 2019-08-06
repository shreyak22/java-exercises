package org.launchcode.java.studios.BankAccount;

public class BankAccount {
    private int accountID;
    protected double balance;

    public BankAccount(int id, double balance) {
        this.accountID = id;
        this.balance = balance;
    }

    public BankAccount(int id) {
        this.accountID = id;
    }

    public double withdraw(double amount) {
        if(amount > 0 && this.balance - amount >= 0) {
            this.balance = this.balance - amount;
        }
        return this.balance;
    }

    public double deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public String toString() {
        return "ID: " + this.accountID + " Balance: " + this.balance;
    }
}



