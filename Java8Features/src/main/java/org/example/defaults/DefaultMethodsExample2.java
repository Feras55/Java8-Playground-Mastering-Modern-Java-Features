package org.example.defaults;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    public static Consumer<Student> consumer = System.out::println;
    public static Comparator<Student> compareByName = Comparator.comparing(Student::getName);
    public static Comparator<Student> compareByGPA = Comparator.comparingDouble(Student::getGpa);
    public static Comparator<Student> compareByGradeLevel = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> students){
        students.sort(compareByName);
        students.forEach(consumer);
    }

    public static void sortByGPA(List<Student> students){
        students.sort(compareByGPA);
        students.forEach(consumer);
    }
    public static void sortChaining(List<Student> students){
        students.sort(compareByGradeLevel.thenComparing(compareByName));
        students.forEach(consumer);
    }
    public static void sortWithNullValues(List<Student> students){

        Comparator<Student> comparator = Comparator.nullsFirst(compareByName);
        students.sort(comparator);
        students.forEach(consumer);
    }

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Before Sort: ");

        students.forEach(consumer);

        System.out.println("After Sort:");
//        sortByName(students);
//        sortByGPA(students);
//        sortChaining(students);
        sortWithNullValues(students);


    }
}
