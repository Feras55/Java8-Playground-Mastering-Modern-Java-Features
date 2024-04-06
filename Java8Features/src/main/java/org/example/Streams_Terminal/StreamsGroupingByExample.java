package org.example.Streams_Terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    //ONE LEVEL GROUPING
    public static Map<String, List<Student>> groupByGender(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }
    public static Map<String, List<Student>> customizedGroupingBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student ->
                        student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    //TWO LEVEL GROUPING
    public static Map<Integer, Map<String, List<Student>>> twoLevelGroupBy_1(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student ->
                                student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));
    }
    public static Map<String, Integer> twoLevelGroupBy_2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy
                        (Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));
    }
    public static LinkedHashMap<String, Set<Student>> threeLevelGroupBy(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy
                        (Student::getName,
                                LinkedHashMap::new,
                                Collectors.toSet()));
    }

    //Grouping + Max/Min

    public static Map<Integer, Optional<Student>> getTopStudentPerGrade(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing
                                (Student::getGpa))
                ));
    }
    public static Map<Integer, Student> getTopStudentPerGradeAvoidOptional(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)
                ));
    }
    public static Map<Integer, Student> getLeastStudentPerGrade(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)
                ));
    }

    public static void main(String[] args) {
        System.out.println(groupByGender());
        System.out.println();
        System.out.println(customizedGroupingBy());
        System.out.println("TWO LEVEL GROUP BY");
        System.out.println(twoLevelGroupBy_1());
        System.out.println(twoLevelGroupBy_2());
        System.out.println("THREE LEVEL GROUP BY");
        System.out.println(threeLevelGroupBy());
        System.out.println("GROUP BY + Max By");
        System.out.println(getTopStudentPerGrade());
        System.out.println("GROUP BY + Max By (Avoid Optional");
        System.out.println(getTopStudentPerGradeAvoidOptional());
        System.out.println("GROUP BY + Min By");
        System.out.println(getLeastStudentPerGrade());
    }
}
