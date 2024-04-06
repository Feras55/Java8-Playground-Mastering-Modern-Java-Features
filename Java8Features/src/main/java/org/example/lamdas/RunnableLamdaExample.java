package org.example.lamdas;

public class RunnableLamdaExample {
    public static void main(String[] args) {


        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //JAVA 8

        // () -> {}

        Runnable runnable2 = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnable2).start();

        Runnable runnable3 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnable3).start();

        new Thread(()-> System.out.println("Inside Runnable 4")).start();

    }
}
