package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Administrator
 * @date 2018/3/5 0005
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        EmpDemo e = null;

        try {
            FileInputStream fileIn = new FileInputStream("/tmp/emp.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (EmpDemo) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        } catch (ClassNotFoundException e1) {
            System.out.println("EmpDemo class not found");
            e1.printStackTrace();
            return;
        }
        System.out.println("Deserialized Emp ...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);

    }
}
