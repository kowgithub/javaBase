package com.example.demo.Serializable;

import java.io.*;

public class DeserializeDemo {

    public static void main(String[] args) {
        Employee employee = null;

        try{
            FileInputStream fileInputStream = new FileInputStream("\\D:\\temp.ser");
            ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        }catch (IOException e){
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException ee){
            ee.printStackTrace();
            System.out.println("Class not found");
        }
        System.out.println("Deserialize Employee...");
        System.out.println("Name:"+employee.name);
        System.out.println("Address: "+employee.address);
        System.out.println("SSN"+employee.SSN);
        System.out.println("Number"+employee.number);
    }
}
