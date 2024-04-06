package org.example.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformance(Supplier<Integer> supplier, int numberOfTimes){

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime-startTime;
    }
    public static Supplier<Integer> sumSequentialStream = ()->{
        return IntStream.rangeClosed(1,1000000)
                .sum();
    };
    public static Supplier<Integer> sumParallelStream = ()->{
        return IntStream.rangeClosed(1,1000000)
                .parallel() //split data into multiple parts and process them concurrently
                .sum();
    };

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Performance Time:  " + checkPerformance(sumSequentialStream,20));
        System.out.println("Parallel Performance Time:  " + checkPerformance(sumParallelStream, 20));
    }
}
