package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> isGradeLevelEqualOrAboveThree = (student) -> student.getGradeLevel() >=3;
        Predicate<Student> isGpaEqualOrAboveThreePointNine = (student) -> student.getGpa() >=3.9;

            Map<String,List<String>> studentMap =  StudentDataBase.getAllStudents().stream()
                    .peek(System.out::println)
                    .filter(isGradeLevelEqualOrAboveThree)
                    .peek(student -> System.out.println("After 1st filter: " + student))
                    .filter(isGpaEqualOrAboveThreePointNine)
                    .peek(student -> System.out.println("After 2nd filter: " + student))
                    .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);

    }
}
