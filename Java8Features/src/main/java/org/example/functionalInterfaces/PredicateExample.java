package org.example.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = (x) -> {
        return x % 2 == 0;
    };
    static Predicate<Integer> p2 = (x) -> x % 2 == 0;

    static Predicate<Integer> p3 = (x) -> x%5 == 0;

    public static void predicateAnd(){
        System.out.println( "Predicate AND: " + p2.and(p3).test(5));
    }
    public static void predicateOr(){
        System.out.println( "Predicate OR: " + p2.or(p3).test(5));
    }

    public static void predicateOrNegate(){
        System.out.println( "Predicate OR NEGATE: " + p2.or(p3).negate().test(5));
    }

    public static void main(String[] args) {
        System.out.println(p1.test(4));
        System.out.println(p2.test(4));

        predicateAnd();
        predicateOr();
        predicateOrNegate();

    }
}
