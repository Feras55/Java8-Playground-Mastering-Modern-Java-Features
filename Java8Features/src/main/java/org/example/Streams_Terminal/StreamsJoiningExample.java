package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ")); //Adds delimiter
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ",  "(",  ")")); //Adds delimiter,  Prefix, and Suffix
    }
    public static void main(String[] args) {
        System.out.println("Joining 1: " + joining_1());
        System.out.println("Joining 2: " + joining_2());
        System.out.println("Joining 3: " + joining_3());

    }
}
