package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class BRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.println("输入字符，按下 q 键退出");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');*/

        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
