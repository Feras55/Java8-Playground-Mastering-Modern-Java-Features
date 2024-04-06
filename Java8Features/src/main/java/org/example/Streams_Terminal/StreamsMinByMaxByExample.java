package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> getMaxBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .max(Comparator.comparing(Student::getGpa));
    }
    public static Optional<Student> getMinBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(getMinBy());
        System.out.println(getMaxBy());
    }
}
