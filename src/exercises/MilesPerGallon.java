package exercises;

import java.util.*;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles you have drive: ");
        double miles = in.nextDouble();

        System.out.println("Amount of gas consumed:");
        double gallon = in.nextDouble();

        double milesPerGallon = miles /gallon;
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
