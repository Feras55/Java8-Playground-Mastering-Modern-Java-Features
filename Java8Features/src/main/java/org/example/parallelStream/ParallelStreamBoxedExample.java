package org.example.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sequential Sum Duration: " + (System.currentTimeMillis() - startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel Sum Duration: " + (System.currentTimeMillis() - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = IntStream.rangeClosed(1,1000)
                .boxed()
                .collect(Collectors.toList());
        sequentialSum(integers);
        parallelSum(integers);
    }
}
