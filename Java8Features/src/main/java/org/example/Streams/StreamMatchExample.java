package org.example.Streams;

import org.example.data.StudentDataBase;

import static org.example.functionalInterfaces.PredicateStudentExample.isGPA3Point9OrAbove;

public class StreamMatchExample {

    public static boolean getAnyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(isGPA3Point9OrAbove);
    }
    public static boolean getAllMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=4.0);
    }
    public static boolean getNoneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.0);
    }
    public static void main(String[] args) {
        System.out.println(getAnyMatch());
        System.out.println(getAllMatch());
        System.out.println(getNoneMatch());
    }
}
