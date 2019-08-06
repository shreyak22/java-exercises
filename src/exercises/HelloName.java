package exercises;



import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );




        System.out.print("Please enter your name: ");
        String usersName = in.nextLine();

        String upperCaseName = usersName.toUpperCase();

        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

    }

}



