package com.example.demo.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name="all";
        employee.address="peer";
        employee.SSN=111222333;
        employee.number=101;

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("\\D:\\temp.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();

            fileOutputStream.close();
            System.out.println("Serialized data is saved in \\D:\\temp.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
