package com.company;

import java.util.Date;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class LockTest {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args) {
        LockA la = new LockA();
        new Thread(la).start();
        LockB lb = new LockB();
        new Thread(lb).start();
    }
}

class LockA implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA开始执行");
            while (true) {
                synchronized (LockTest.obj1) {
                    System.out.println(new Date().toString() + "LockA 锁住了obj1");
                    Thread.sleep(3 * 1000);
                    synchronized (LockTest.obj2) {
                        System.out.println(new Date().toString() + "LockA 锁住了obj2");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LockB implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB开始执行");
            while (true) {
                synchronized (LockTest.obj2) {
                    System.out.println(new Date().toString() + "LockB 锁住了obj2");
                    Thread.sleep(3 * 1000);
                    synchronized (LockTest.obj1) {
                        System.out.println(new Date().toString() + "LockB锁住了obj1");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
