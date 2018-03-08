package com.company;

import java.util.Scanner;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class RhombusDemo {
    public void printOne(float c) {
        float p = c / 2;
        float d;
        float e;
        float f;
        float r;
        float s = c % 2;
        if (s == 0) {
            System.out.println("你输入的数据不能形成菱形结构");
        } else {
            for (d = 1; d <= p; d++) {
                for (f = p; f >= d; f--) {
                    System.out.print(" ");
                }
                for (e = 1; e <= d * 2 - 1; e++) {
                    if (e == 1 || e == d * 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void printTwo(float m) {
        float i;
        float j;
        float k;
        float n = m / 2 + 1;
        float o = m % 2;
        if (o == 0) {
            System.out.print("");
        } else {
            for (i = 1; i <= n; i++) {
                for (k = 0; k < i - 1; k++) {
                    System.out.print(" ");
                }
                for (j = (n - k) * 2 - 2; j >= 1; j--) {
                    if (j == (n - k) * 2 - 2 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            long startTime = System.nanoTime();
            RhombusDemo rd = new RhombusDemo();
            Scanner scan = new Scanner(System.in);
            System.out.println("**************************");
            System.out.println("请输入数字：");
            if (!scan.hasNextFloat()) {
                System.out.println("请输入一个整数或浮点数！");
                continue;
            }
            float b = scan.nextFloat();
            rd.printOne(b);
            rd.printTwo(b);
            long endTime = System.nanoTime();
            System.out.println("耗时：" + (endTime - startTime) + "纳秒");
            System.out.println("特性:"+System.getProperties() );
        }
    }
}