package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (List<Student> students) -> {
        Map<String, Double> nameGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.isGradeLevel3OrAbove.test(student)){
                nameGpaMap.put(student.getName(), student.getGpa());
            }
        });

        return nameGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
