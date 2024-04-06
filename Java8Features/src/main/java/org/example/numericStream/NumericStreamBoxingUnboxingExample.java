package org.example.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(0,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unboxing(List<Integer> integers){
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unboxing(boxing()));

    }
}
