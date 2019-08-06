package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        double pi = 3.14;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();

        area = pi * radius * radius;
        System.out.println("The area of a circle of radius" +radius+ " is:" + area);



    }

}
