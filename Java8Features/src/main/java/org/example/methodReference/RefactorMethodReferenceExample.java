package org.example.methodReference;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> isGradeLevel3OrAbove = student -> student.getGradeLevel() >= 3;

    //Turn to method reference
    ///1. Put the functional  interface executed logic into a separate method.

    public static boolean isGreaterThanGradeLevelThree(Student student){
        return student.getGradeLevel() >= 3;
    }

    //2. pass the  method   to the functional interface

    static Predicate<Student> isGradeLevel3OrAboveMethodReference = RefactorMethodReferenceExample::isGreaterThanGradeLevelThree;

    public static void main(String[] args) {

        System.out.println(isGradeLevel3OrAbove.test(StudentDataBase.studentSupplier.get()));
        System.out.println(isGradeLevel3OrAboveMethodReference.test(StudentDataBase.studentSupplier.get()));

    }
}
