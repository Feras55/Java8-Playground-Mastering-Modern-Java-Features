package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static Predicate<Student> predicate = student -> student.getGpa()>=3.8;
    public static Map<Boolean, List<Student>> partition1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(predicate));
    }
    public static Map<Boolean, Set<Student>> partition2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(
                        predicate,
                        Collectors.toSet()));
    }
    public static void main(String[] args) {
        System.out.println(partition1());
        System.out.println(partition2());
    }
}
