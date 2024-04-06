package org.example.parallelStream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000) //Sum should be 500500
                .parallel() //Accessing a mutable variable parallel distorts the expected value
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());
    }
}
