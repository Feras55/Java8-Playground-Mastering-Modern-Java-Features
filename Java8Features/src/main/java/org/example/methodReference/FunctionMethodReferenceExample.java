package org.example.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseLamda = (word) -> word.toUpperCase();
    static Function<String,String> toUpperCaseMethodReference = String:: toUpperCase;

    public static void main(String[] args) {


        System.out.println(toUpperCaseLamda.apply("Word"));

        System.out.println(toUpperCaseMethodReference.apply("Word"));
    }
}
