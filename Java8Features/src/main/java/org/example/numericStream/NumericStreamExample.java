package org.example.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfNIntegers(List<Integer> integers) {
        return integers.stream() //Performs unboxing from Integer to primitive int
                .reduce(0,Integer::sum);
    }
    public static int sumOfNIntegersIntStream() {
        return IntStream.rangeClosed(1,6)
                .sum();
    }
    public static void main(String[] args) {

        List<Integer>  integers  = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfNIntegers(integers));
        System.out.println(sumOfNIntegersIntStream());
    }
}
