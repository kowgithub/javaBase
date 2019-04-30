package com.example.demo.Collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,25,"关于1"));
        studentList.add(new Student(2,46,"关于2"));
        studentList.add(new Student(3,15,"关于3"));
        studentList.add(new Student(4,64,"关于4"));
        studentList.add(new Student(5,2,"关于5"));
        studentList.add(new Student(6,31,"关于6"));

        Collections.sort(studentList);

        for(Student student: studentList){
            System.out.println(student.toString());
        }
    }
}
