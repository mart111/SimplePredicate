import sun.jvm.hotspot.runtime.Threads;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {


    public static void main(String[] args) {

        Student st1=new Student("Martin","Knayazyan",19);
        Student st2=new Student("Erik","Knyazyan",18);
        Student st3=new Student("Saten","Knayazyan",9);
        Student st4=new Student("Arman","Knayazyan",16);

        List<Student> students=new ArrayList<>(Arrays.asList(st1,st2,st3,st4));

        System.out.println(PredicateStudents.filterEmployees(students,PredicateStudents.isAdult()));
        System.out.println(PredicateStudents.filterEmployees(students,PredicateStudents.isNameBeginWithM()));

    }

}
