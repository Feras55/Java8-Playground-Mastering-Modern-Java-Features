package org.example.optional;

import org.example.data.Bike;
import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student.filter(student1 -> student1.getGpa() >= 3.5)
                .ifPresent(student1 -> System.out.println(student1.getName()));
    }

    public static void optionalMap() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (student.isPresent()) {
            Optional<String> name = student.filter(student1 -> student1.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(name.get());
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = student.filter(student1 -> student1.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        name.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
