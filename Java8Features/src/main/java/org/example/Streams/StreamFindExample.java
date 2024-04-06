package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

import static org.example.functionalInterfaces.PredicateStudentExample.isGPA3Point9OrAbove;

public class StreamFindExample {

    public static Optional<Student> getFindAny(){
            return StudentDataBase.getAllStudents().stream()
                    .filter(isGPA3Point9OrAbove)
                    .findAny();
    }

    public static Optional<Student> getFindFirst(){
            return StudentDataBase.getAllStudents().stream()
                    .filter(isGPA3Point9OrAbove)
                    .findAny();
    }

    public static void main(String[] args) {
        getFindAny().ifPresent(System.out::println);
        getFindFirst().ifPresent(System.out::println);
    }
}
