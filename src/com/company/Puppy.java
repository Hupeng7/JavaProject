package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class Puppy {
    int puppAge;

    public Puppy(String name) {
        System.out.println("小狗的名字是:" + name);
    }

    public void setPuppAge(int age) {
        puppAge = age;
    }

    public int getPuppAge() {
        System.out.println("小狗的年龄为:" + puppAge);
        return puppAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setPuppAge(2);
        myPuppy.getPuppAge();
        System.out.println("变量值:" + myPuppy.puppAge);
    }
}
