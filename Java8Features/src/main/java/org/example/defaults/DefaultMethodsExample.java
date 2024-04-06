package org.example.defaults;

import java.util.*;

public class DefaultMethodsExample {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike");

//        //prior Java 8
//        Collections.sort(stringList);
//        System.out.println("Prior Java 8 Sort: " + stringList);
//
        //Java 8

        stringList.sort(Comparator.naturalOrder()); //sorts lexicographically
        System.out.println("Post Java 8 Sort: " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Post Java 8 Sort: reverse" + stringList);//sorts reverse lexicographically


    }
}
