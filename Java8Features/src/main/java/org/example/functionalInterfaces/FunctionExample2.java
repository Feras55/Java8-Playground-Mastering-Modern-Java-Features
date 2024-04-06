package org.example.functionalInterfaces;

public class FunctionExample2 {

    public static String performConcat(String word){
        return FunctionExample.function2.compose(FunctionExample.function).apply(word);
    }
    public static void main(String[] args) {

        System.out.println(performConcat("Helloooo"));
    }
}
