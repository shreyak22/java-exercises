package newexercises;

import java.util.List;

public class MaxNum {

    public static Integer getElement(List<Integer> list, Integer n) {
        Integer oneInt = list.get ( n );

        for (int i = 0; i <= list.size (); i++) {
            if (i > list.size ()) {
                return -1;
            }
        }
        return oneInt;
    }


}
