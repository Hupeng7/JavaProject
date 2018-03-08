package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    private static int count = 500;

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < count; i++) {
            new InstanceCounter();
            System.out.println("创建第 " + InstanceCounter.getCount() + " 个实例");
            try {
                //休眠一秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
