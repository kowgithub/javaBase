package com.example.demo.DesignPattern.DAO模式;

public class DaoPattern {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        for(Student student : studentDao.getAllStudent()){
            System.out.println("Student:[RollNo:"
                +student.getRollNo()+",name"+student.getMame()+"]");
        }

        Student student = studentDao.getAllStudent().get(0);
        student.setMame("michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student:[RollNo:"
            +student.getRollNo()+",Name:"+student.getMame()+"]");
    }
}
