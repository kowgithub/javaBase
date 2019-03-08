package com.example.demo.DesignPattern.TransferObjectPattern;

public class Demo {
    public static void main(String[] args) {
        StudentBo studentBo = new StudentBo();

        for(StudentVo studentVo:studentBo.getAllStudents()){
            System.out.println(studentVo.getRollNo()+studentVo.getName());
        }

        StudentVo studentVo = studentBo.getAllStudents().get(0);
        studentVo.setName("Michael");
        studentBo.updateStudent(studentVo);

        studentBo.getStudent(0);
        System.out.println(studentVo.getRollNo()+studentVo.getName());

    }
}
