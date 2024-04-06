package org.example.Streams_Terminal;

import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class SteamsCountingExample {

    public static long counting(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(counting());
    }
}
