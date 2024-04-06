package org.example.Streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performReduce(List<Integer> integers){

        return integers.stream()
                //Identity  is 1.
                // a =  1, b = 1  -> perform operation, put result  in a
                //a  =  1, b = 3, --> a=3
                //a = 3, b = 5    --> a = 15
                //a =  15, b  =  7, -->  a = 105
                .reduce(1, (a,b) -> a*b);
    }
    public static Optional<Integer> performReduceWithoutIdentity(List<Integer> integers){

        return integers.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((a,b) -> a.getGpa() >= b.getGpa()?a:b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performReduce(integers));
        Optional<Integer> result  = performReduceWithoutIdentity(integers);
        result.ifPresent(System.out::println);

        Optional<Integer> result1  = performReduceWithoutIdentity(integers1);
        System.out.println(result1.isPresent());
        result1.ifPresent(System.out::println);

        System.out.println("----------------------------------\nSTUDENT EXAMPLE");

        getHighestGpaStudent().ifPresent((System.out::println));
    }
}
