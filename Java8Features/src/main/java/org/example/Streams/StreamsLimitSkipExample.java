package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream() //6,7,8,9,10
                .limit(3) //6,7,8
                .reduce(Integer::sum);
    }
    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()   //6,7,8,9,10
                .skip(3) //9,10
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer>integers = Arrays.asList(6,7,8,9,10);
        Optional<Integer> result = limit(integers);

        String s = result.map(integer -> "Result: " + integer).orElse("Value not found");
        System.out.println(s);

        Optional<Integer> result1 = skip(integers);

        String s1 = result1.map(integer -> "Result: " + integer).orElse("Value not found");
        System.out.println(s1);
    }
}
