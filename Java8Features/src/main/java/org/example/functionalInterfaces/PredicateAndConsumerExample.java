package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> isGradeLevel3OrAbove = (student) -> student.getGradeLevel()>=3;
    Predicate<Student> isGpa3Point9OrAbove = (student) -> student.getGpa() >=3.9;

    BiPredicate<Double, Integer> isGradeLevel3OrAboveAndIsGpa3Point9OrAbove = (gpa, gradeLevel) -> gradeLevel >=3 && gpa >= 3.9;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ": " + activities);
    Consumer<Student> consumer = (student -> {
        if(isGradeLevel3OrAboveAndIsGpa3Point9OrAbove.test(student.getGpa(), student.getGradeLevel())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    void printNameAndActivities(List<Student> students){
        students.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
}
