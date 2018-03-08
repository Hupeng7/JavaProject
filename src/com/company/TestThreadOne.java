package com.company;

/**
 * @author Administrator
 * @date 2018/3/6 0006
 */
public class TestThreadOne {
    public static void main(String[] args) {
        ThreadDemoOne T1 = new ThreadDemoOne("Thread-1");
        ThreadDemoOne T2 = new ThreadDemoOne("Thread-2");
        T2.setPriority(10);
        T1.setPriority(1);
        T1.start();
        T2.start();

        System.out.println(T1.currentThread().getName());
        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());
        System.out.println(T1.currentThread().getId());
    }
}

class ThreadDemoOne extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemoOne(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread: " + threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + " exiting.");
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}