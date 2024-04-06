package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public List<String> namesList() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        StreamMapExample streamMapExample = new StreamMapExample();
        System.out.println(streamMapExample.namesList());
        System.out.println(streamMapExample.namesSet());
    }
}
