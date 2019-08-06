package org.launchcode.java.studios.BankAccount;

public class Checking extends BankAccount {
    private double fee;


    public Checking(int id, double balance, double fee) {
        super ( id, balance );
        this.fee = fee;
    }

    public Checking(int id) {
        super ( id );
    }

    public double deductFee(){
        this.balance = this.balance - this.fee;
        return  this.balance;
        //or you can call withdraw(this.fee)
    }
}
