package com.company;

import java.io.*;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class TransientPeople {
    public static void main(String[] args) {
        People p1 = new People("Li Lei", 30);
        System.out.println(p1);
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d://people.txt"));
            os.writeObject(p1);
            os.close();

            ObjectInputStream is = new ObjectInputStream(new FileInputStream("d://people.txt"));
            p1 = (People) is.readObject();
            System.out.println(p1);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
