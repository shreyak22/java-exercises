package exercises;
import java.util.Scanner;


public class AreaOfRectangle {

        public static void main(String args[]) {
            Scanner s= new Scanner(System.in);

            System.out.println("Enter the length:");
            double length= s.nextDouble();

            System.out.println("Enter the breadth:");
            double breadth= s.nextDouble();


            double  area=length*breadth;
            System.out.println("Area of Rectangle is: " + area);
        }


    }

