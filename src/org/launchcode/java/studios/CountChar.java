package org.launchcode.java.studios;


import java.util.HashMap;
import java.util.Map;

public class CountChar {



    static final int MAX_CHAR = 256;

    public static void charCount(String str)
    {

//        int count[] = new int[MAX_CHAR];
//
//        int len = str.length();
//
//        for (int i = 0; i < len; i++)
//            count[str.charAt(i)]++;
//
//
//        char ch[] = new char[str.length()];
//        for (int i = 0; i < len; i++) {
//            ch[i] = str.charAt(i);
//            int find = 0;
//            for (int j = 0; j <= i; j++) {
//
//
//                if (str.charAt(i) == ch[j])
//                    find++;
//            }
//
//            if (find == 1)
//                System.out.println(str.charAt(i) + " :" + count[str.charAt(i)]);
//        }

        Map<String, Integer> myMap = new HashMap<>();

        int len = str.length();

        for (int i = 0; i < len; i++) {

            String charToCheck = "" + str.charAt(i);
            Integer count = myMap.get(charToCheck);

            if (count == null) {
                myMap.put(charToCheck, 1);
            } else {
                myMap.put(charToCheck, myMap.get(charToCheck) + 1);
            }
        }

        System.out.println(myMap);
    }
    public static void main(String[] args)
    {

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Nunc accumsan sem ut ligula scelerisque sollicitudin. " +
                "Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        charCount(str);
    }
}




