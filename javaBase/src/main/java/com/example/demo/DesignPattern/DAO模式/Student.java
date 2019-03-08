package com.example.demo.DesignPattern.DAO模式;

public class Student {
    private String mame;
    private int rollNo;

    public Student(String mame, int rollNo) {
        this.mame = mame;
        this.rollNo = rollNo;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
