package org.example.lamdas;

import java.util.Comparator;

public class ComparatorLamdaExample {
    public static void main(String[] args) {
        /**
         * Prior JAVA 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        //LAMDA

        Comparator<Integer> comparator1 = Integer::compareTo;

        System.out.println("Result of Comparator 1 is: " + comparator1.compare(3,2));
        Comparator<Integer> comparator2 = (Integer o1, Integer o2) ->o1.compareTo(o2);

        System.out.println("Result of Comparator 2 is: " + comparator2.compare(3,12));

        Comparator<Integer> comparator3 = (o1,o2) ->o1.compareTo(o2);
        System.out.println("Result of Comparator 3 is: " + comparator3.compare(3,12));


    }
}
