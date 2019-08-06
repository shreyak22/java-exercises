package org.launchcode.java;

public class practice {

    public static int firstAndLastSum(int[] array){
        int first = array[0];
        int last = array[array.length-1];
        return first + last;
    }
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = new int[2];
        a2[0]=7;
        a2[1]=19;

        int result = firstAndLastSum(a1);
        System.out.println("Result is: " +result);
        System.out.println(firstAndLastSum(a2));
    }
}
