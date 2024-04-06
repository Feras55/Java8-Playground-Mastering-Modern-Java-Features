package org.example.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (word) ->word.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java"));
    }
}
