package com.company;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class Overloading {
    private static int i = 1;
    private static double l = 3.1415;
    private static String k = "我是栗子";

    public void test(int a) {
        System.out.println("你输入了整数：" + a);
    }

    public void test(double a) {
        System.out.println("你输入了浮点数:" + a);
    }

    public void test(String a) {
        System.out.println("你输入了字符串:" + a);
    }

    public static void main(String[] args) {
        Overloading exam = new Overloading();
        exam.test(i);
        exam.test(l);
        exam.test(k);
    }


}
