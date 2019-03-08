package com.example.demo.DesignPattern.TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBo {
    List<StudentVo> students;

    public StudentBo(){
        students = new ArrayList<StudentVo>();
        StudentVo student1 = new StudentVo("Robert",0);
        StudentVo student2 = new StudentVo("jhon",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVo student){
        students.remove(student.getRollNo());
        System.out.println(student.getRollNo() +"is deleted");
    }
    public List<StudentVo> getAllStudents(){
        return students;
    }
    public StudentVo getStudent(int rollno){
        return students.get(rollno);
    }
    public void updateStudent(StudentVo studentVo){
        students.get(studentVo.getRollNo()).setName(studentVo.getName());
        System.out.println("update"+studentVo.getRollNo());
    }

}
