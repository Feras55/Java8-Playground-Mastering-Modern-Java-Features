package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Sorting students by name:  ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Sorting students by GPA:  ");
        sortStudentsByGpa().forEach(System.out::println);
    }
}
