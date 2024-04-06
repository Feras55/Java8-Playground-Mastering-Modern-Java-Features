package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

public class StreamMapReduce {

    public static Integer getTotalNumberOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNotebooks)
                .reduce(0, Integer::sum);

    }
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfNotebooks());
    }
}
