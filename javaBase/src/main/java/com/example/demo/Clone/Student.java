package com.example.demo.Clone;

public class Student implements Cloneable {

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    protected Student clone() throws CloneNotSupportedException{
        return (Student)super.clone();
    }
}
