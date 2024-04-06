package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> isGradeLevel3OrAbove = (student) -> student.getGradeLevel()>=3;
    public static Predicate<Student> isGPA3Point9OrAbove = student -> student.getGpa() >= 3.9;

    private static void filterStudentsByGradeLevel() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Filter by Grade Level");
        students.forEach(student -> {
            if (isGradeLevel3OrAbove.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGPA() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Filter by GPA");

        students.forEach(student -> {
            if (isGPA3Point9OrAbove.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGPAANDGradeLevel() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Filter by GPA AND GRADE LEVEL");

        students.forEach(student -> {
            if (isGPA3Point9OrAbove.and(isGradeLevel3OrAbove).test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGPA();
        filterStudentsByGPAANDGradeLevel();
    }
}
