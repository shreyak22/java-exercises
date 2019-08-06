package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arrays {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;

        List<Integer> intList = new ArrayList<>();
        intList.add(a);
        intList.add(0, b);

//        int[] intList = {a,b};
//        System.out.println(intList);

        Map<String, Integer> intMap = new HashMap<>();
        intMap.put("first", 1);
        intMap.put("second", 4);
        intMap.put("first", intMap.get("first") +1);

        System.out.println(intMap.get("first"));

    }
}
