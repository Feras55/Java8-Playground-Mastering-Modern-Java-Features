package org.example.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integers = Arrays.asList(3,5,10);

        System.out.println("Multiply: " + multiplier.multiply(integers));
        System.out.println("Size: " + multiplier.size(integers));
        System.out.println("IsEmpty: " + Multiplier.isEmpty(integers));

    }
}
