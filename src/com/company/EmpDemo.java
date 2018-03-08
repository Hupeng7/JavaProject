package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018/3/5 0005
 */
public class EmpDemo implements Serializable {
    public String name;
    public String address;
    /**
     * 路过的，省略
     */
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

    public static void main(String[] args) {
        EmpDemo e = new EmpDemo();
        e.name = "Black";
        e.address = "city of Shanghai";
        e.SSN = 123456;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/emp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/emp.ser");
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }
}
