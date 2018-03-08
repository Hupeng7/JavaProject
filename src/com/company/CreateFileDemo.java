package com.company;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class CreateFileDemo {
    public static void main(String[] args) {
        File file = null;
        File dir = new File("D:/");
        try {
            file = File.createTempFile("JavaTemp",".javatemp",dir);
            System.out.println(file.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
