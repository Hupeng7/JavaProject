package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class StaticTest {
    private static int staticInt = 2;
    private int random = 2;

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = " + staticInt + " random = " + random);
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest test2 = new StaticTest();
    }
}
