package exercises;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter side: " );

        Integer side = in.nextInt ();

        System.out.println ("Area of square : "  + (side * side) );
    }
}
