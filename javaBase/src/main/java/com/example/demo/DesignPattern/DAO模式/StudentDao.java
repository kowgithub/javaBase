package com.example.demo.DesignPattern.DAO模式;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudent();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
