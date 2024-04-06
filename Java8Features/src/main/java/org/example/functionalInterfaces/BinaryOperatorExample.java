package org.example.functionalInterfaces;

import java.awt.image.BufferedImage;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = Integer::compareTo;
    ;

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

        System.out.println(binaryOperator.apply(5, 4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(5,4));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(5,4));
    }
}
