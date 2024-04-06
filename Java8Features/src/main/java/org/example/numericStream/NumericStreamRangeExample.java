package org.example.numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();

        System.out.println(IntStream.range(1,50).count());
        IntStream.range(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();

        System.out.println(LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();

        System.out.println(LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();

        System.out.println(IntStream.rangeClosed(1,50).asDoubleStream().count());
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
        System.out.println();

        System.out.println(IntStream.range(1,50).asDoubleStream().count());
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
        System.out.println();
    }
}
