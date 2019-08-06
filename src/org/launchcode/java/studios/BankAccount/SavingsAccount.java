package org.launchcode.java.studios.BankAccount;

public class SavingsAccount extends BankAccount {
        private double interestRate;

    public SavingsAccount(int id, double balance, double interestRate) {
        super ( id, balance );
        this.interestRate = interestRate;
    }

    public SavingsAccount(int id) {
        super ( id );
    }

    public double compoundInterest(){
        double interest = this.balance * this.interestRate;
        return this.balance;
    }
}
