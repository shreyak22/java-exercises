package org.launchcode.java.studios.Class.Design.Studio;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        String q1 = "Animals are cute? \n(true/false)";
        String q2 = "You know how is life? \n(No/Yes)";
        String q3 = "Tell me color of you hair? "
                + "(a)red/brown\n (b)black/white \n (c)blue/charcoal";
        String q4 =  "Tell me color of you eyes? "
                + "(a)red/brown\n (b)black/white \n (c)blue/charcoal";



        ArrayList<Quiz> questions = new ArrayList<> (  );
        questions.add (new Quiz (q1, "true") );
        questions.add (new Quiz (q2, "No") );
        questions.add (new Quiz (q3, "a") );
        questions.add (new Quiz (q4, "c") );


        goQuiz ( questions );

    }

    public static void goQuiz(ArrayList<Quiz> questions){

        Scanner keyboardInput = new Scanner ( System.in );

        int myscore = 0;
        for (int i = 0; i< questions.size (); i++) {
            System.out.println (questions.get ( i ).console );
            String answer = keyboardInput.nextLine ();
            if(answer.equals (questions.get ( i ).myAnswer )){
                myscore ++ ;
            }

            System.out.println ("your score is :  " +myscore+ "/" +questions.size () );



        }

    }

}
