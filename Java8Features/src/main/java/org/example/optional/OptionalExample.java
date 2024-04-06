package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
//        Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return student.getName();
        }
        return null;
    }
    public static Optional<String> getStudentNameOptional(){
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.empty();
        if(student.isPresent()){
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if(name!=null){
//            System.out.println("Name Length: "  + name.length());
//        }else{
//            System.out.println("Name not Found!");
//        }
        Optional<String> optionalName = getStudentNameOptional();
        if(optionalName.isPresent()){
            System.out.println("Name Length: "  + optionalName.get().length());
        }else
            System.out.println("Name not Found!");

    }
}
