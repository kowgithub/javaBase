package com.example.demo.Clone;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setGender("male");
        student.setName("kowloon");
        System.out.println("Student"+student);

        try {
            Student student1 = student.clone();

            System.out.println("Student1"+student1);
            System.out.println(student.equals(student1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
