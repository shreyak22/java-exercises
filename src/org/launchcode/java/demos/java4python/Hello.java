package org.launchcode.java.demos.java4python;

/**
 * From "Java for Python Programmers"
 */
public class Hello {

    private String message = "Hello World";

    void sayHello(){
        System.out.println ( message );
    }

    public static void main(String[] args){

        Hello newWord = new Hello ();
        newWord.sayHello ();
    }

}
