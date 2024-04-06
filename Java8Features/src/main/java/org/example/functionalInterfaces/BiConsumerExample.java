package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;


import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void namesAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String,List<String>> biConsumer = (name, activities) -> System.out.println(name+": " + activities);
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) ->{
            System.out.println("a: " + a + "b: " + b);
        };

        biConsumer.accept("java8","java7");
        BiConsumer<Integer, Integer> add = (a,b) -> System.out.println("Addition: " + (a+b));

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication: " + a*b);
        BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println("Divison: " + a/b);

        multiply.andThen(divide).accept(10,5);
        add.andThen(multiply.andThen(divide)).accept(10,5);


        namesAndActivities();

    }
}
