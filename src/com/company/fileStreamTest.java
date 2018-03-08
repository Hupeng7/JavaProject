package com.company;

import java.io.*;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + " ");
            }
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
