package org.example.parallelStream;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialStudentActivities(){

        long startTime = System.currentTimeMillis();

        List<String> stringList= StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Performance Time: " + (endTime-startTime));
        return stringList;
    }
        public static List<String> parallelStudentActivities(){
            long startTime = System.currentTimeMillis();

            List<String> stringList= StudentDataBase.getAllStudents()
                    .parallelStream()
                    .map(Student::getActivities)
                    .flatMap(List::stream)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            long endTime = System.currentTimeMillis();
            System.out.println("Parallel Performance Time: " + (endTime-startTime));
            return stringList;
    }

    public static void main(String[] args) {
        sequentialStudentActivities();
        parallelStudentActivities();
    }
}
