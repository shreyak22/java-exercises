package exercises;

import java.util.Scanner;

public class HelloNameLower {

    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter name: " );
        String aName = in.nextLine ();

        String newName = aName.toLowerCase ();

    System.out.println ("Hello " +newName+ " , you are good person !" );
    }

}
