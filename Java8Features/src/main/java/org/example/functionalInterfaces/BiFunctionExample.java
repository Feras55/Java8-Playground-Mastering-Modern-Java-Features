package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static org.example.functionalInterfaces.PredicateStudentExample.isGradeLevel3OrAbove;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (List<Student> students, Predicate<Student> predicate) ->{
        Map<String, Double> nameGpaMap = new HashMap<>();
        students.forEach(student -> {
                    if(predicate.test(student)){
                        nameGpaMap.put(student.getName(), student.getGpa());
                    }
                }
        );
        return nameGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), isGradeLevel3OrAbove));
    }
}
