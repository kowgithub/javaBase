package com.example.demo.Collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, 25, "关于1"));
        studentList.add(new Student(6, 46, "关于2"));
        studentList.add(new Student(98, 15, "关于3"));
        studentList.add(new Student(4, 64, "关于4"));
        studentList.add(new Student(63, 2, "关于5"));
        studentList.add(new Student(52, 31, "关于6"));

        Collections.sort(studentList, new java.util.Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() - o2.getId() != 0) {
                    return o1.getId() - o2.getId();
                }
                if (o1.getAge() - o2.getAge() != 0) {
                    return o1.getAge() - o2.getAge();
                }
                return 0;
            }
        });
        for(Student student: studentList){
            System.out.println(student.toString());
        }
    }

}
