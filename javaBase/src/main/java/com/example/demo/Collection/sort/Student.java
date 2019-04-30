package com.example.demo.Collection.sort;

public class Student implements Comparable<Student> {

    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    /**
     * 返回值为0， 当前对象的值=比较对象的值，位置不变。
     * 返回值为-， 当前值<比较值 位置靠前。
     * 返回值为+， 当前值>比较值 位置靠后。
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
