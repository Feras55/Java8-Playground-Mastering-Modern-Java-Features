package org.example.numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0,50).sum());

        OptionalInt optionalInt = IntStream.range(0,50).max();
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        OptionalLong optionalLong = LongStream.range(0,50).min();
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.range(0,50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }
}
