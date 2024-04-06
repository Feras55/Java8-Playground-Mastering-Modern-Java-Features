package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

    public static Optional<Integer> getMaxValue(List<Integer> integers){
        return integers.stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> getMinValue(List<Integer> integers){
        return integers.stream()
                .reduce(Integer::min);
    }
    public static void main(String[] args) {

        List<Integer>  integers =Arrays.asList(6,7,8,9,10);
        getMaxValue(integers).ifPresent(System.out::println);
        getMinValue(integers).ifPresent(System.out::println);
    }
}
