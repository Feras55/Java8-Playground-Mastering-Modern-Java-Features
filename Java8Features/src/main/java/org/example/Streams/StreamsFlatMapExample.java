package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> studentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public static long studentActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println(studentActivitiesCount());
    }
}
