package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }
    public static double average(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(average());

    }
}
