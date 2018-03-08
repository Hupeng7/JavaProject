package com.company;

import java.util.Scanner;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("next方式接收:");
        if (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println("输入的结果为:" + str);
        }
        scan.close();*/

        /*int i = 0;
        float f = 0.0f;
        System.out.println("输入整数:");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("整数数据:" + i);
        } else {
            System.out.println("输入的不是整数!");
        }

        System.out.println("输入小数：");
        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("小数数据:" + f);
        } else {
            System.out.println("输入的不是小数!");
        }
        scan.close();*/

        /*double sum = 0;
        int m = 0;
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum / m));
        scan.close();*/

        //Console cons = System.console();
        //String username = cons.readLine();
        //cons.readLine();
        //System.out.println(username);
        //[] password = cons.readPassword("password: ");



    }
}
