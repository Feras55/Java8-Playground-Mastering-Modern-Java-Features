package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    //or Else
    public static String optionalOrElse(){
//       Optional<Student> optionalStudent =
//               Optional.ofNullable(StudentDataBase.studentSupplier.get());
       Optional<Student> optionalStudent =
               Optional.ofNullable(null);

       String name = optionalStudent.map(Student::getName).orElse("Default");
       return name;
    }
    //or Else Get
    public static String optionalOrElseGet(){
//       Optional<Student> optionalStudent =
//               Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent =
                Optional.ofNullable(null);

        String name = optionalStudent.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    public static String optionalOrElseThrow(){
//       Optional<Student> optionalStudent =
//               Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent =
                Optional.ofNullable(null);

        String name = optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Found"));
        return name;
    }

    //or Else Throw
    public static void main(String[] args) {
        System.out.println("Or Else: " + optionalOrElse());
        System.out.println("Or Else Get: " + optionalOrElseGet());
        System.out.println("Or Else Throw: " + optionalOrElseThrow());
    }
}
