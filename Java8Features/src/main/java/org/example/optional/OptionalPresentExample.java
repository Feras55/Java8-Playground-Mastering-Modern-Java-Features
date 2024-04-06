package org.example.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        //is present
        Optional<String> name = Optional.ofNullable("Hello Optional World");
        if (name.isPresent()){
            System.out.println(name.get());
        }

        //if present
        name.ifPresent(s -> System.out.println(s));
    }
}
