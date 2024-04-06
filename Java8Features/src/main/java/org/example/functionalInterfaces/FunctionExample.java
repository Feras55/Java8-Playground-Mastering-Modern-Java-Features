package org.example.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String:: toUpperCase;
    static Function<String, String> function2 = (name) -> name.concat("concaatMeow");

    public static void main(String[] args) {

        System.out.println(function.apply("jaavaaa8"));

        System.out.println(function.andThen(function2).apply("jaava8"));

        System.out.println(function.compose(function2).apply("jaava8"));
    }
}
