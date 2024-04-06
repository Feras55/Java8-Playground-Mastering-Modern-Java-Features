package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static List<String>  mappingToList(){
        return StudentDataBase.getAllStudents()
                .stream().map((Student::getName)).collect(Collectors.toList());

    }
    public static Set<String> mappingToSet(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping((Student::getName), Collectors.toSet()));

    }
    public static void main(String[] args) {
        System.out.println(mappingToList());
        System.out.println(mappingToSet());
    }
}
