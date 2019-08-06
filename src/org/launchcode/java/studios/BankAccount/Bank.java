package org.launchcode.java.studios.BankAccount;

import java.util.ArrayList;

public class Bank  {
    public static void main(String[] args) {
        Checking c = new Checking ( 1,100,5 );
        SavingsAccount s = new SavingsAccount ( 10, 500, 0.000 );

        ArrayList<BankAccount> accounts = new ArrayList<> (  );
        accounts.add ( c );
        accounts.add ( s );

        for(int i = 0; i<accounts.size (); i++){
            BankAccount b = accounts.get ( i );
            //casting
            b.deposit (500 );
            System.out.println (b );
        }

    }
}
