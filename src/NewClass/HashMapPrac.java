package NewClass;

import classObject.Dog;

import java.util.HashMap;

public class HashMapPrac {
    // Creation of HashMap

    public static void main(String[] args) {
        HashMap<String, Integer> geeks = new HashMap<> ( );

        geeks.put ( "Shreya", 1 );
        geeks.put ( "Kaus", 2 );
        geeks.put ( "Mom", 3 );
        geeks.put ( "Dad", 100 );
        geeks.put ( "Deep", -1 );

//        if(! geeks.isEmpty ()){
//            System.out.println ("This hashmap not empty" );
//        }
//
//        for (String s : geeks.keySet ()) {
////            System.out.println (s );
////            System.out.println (geeks.get(s) );
//            System.out.println (s + " value is : " + geeks.get ( s ) );
//
//        }
//
//        for(String name: geeks.keySet ()){
//            if(geeks.get ( name )%2 == 0 ){
//                System.out.println (name );
//            }
//
//        }

//        System.out.println ("Size is :" + geeks.size () );
//        System.out.println (geeks.clone () );


        HashMap<Integer, Dog> newList = new HashMap<> ( );

        Dog tom = new Dog ( "popo", "tom", 1, "black" );
        Dog jon = new Dog ( "doberman", "jon", 4, "white" );
        Dog ross = new Dog ( "germanshepard", "ross", 5, "grey" );
        Dog kiwi = new Dog ( "golden", "kiwi", 8, "white" );

        newList.put ( 1, tom );
        newList.put ( 2, jon );
        newList.put ( 3, ross );
        newList.put ( 4, kiwi );



        for (Integer i : newList.keySet ( )) {
            if(newList.get ( i ).getAge ()%2 ==0) {
                System.out.println ( newList.get ( i ).getName ( ) );
            }

        }
    }
    }




    // Accessing the contents of HashMap through Keys

    // size() method prints the size of HashMap.


