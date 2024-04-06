package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = System.out :: println;
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();


    public static void printStudents() {
        studentList.forEach(c1);
    }

    public static void printNamesAndActivities() {
        studentList.forEach(c2.andThen(c3)); //Consumer Chaining
    }

    public static void printNamesAndActivitiesUsingCondition() {
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                c2.andThen(c3).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        printNamesAndActivitiesUsingCondition();
    }
}
