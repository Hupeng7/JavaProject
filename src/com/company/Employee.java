package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    /**
     * Employee类的构造器
     *
     * @param name
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * 设置age的值
     *
     * @param empAge
     */
    public void empAge(int empAge) {
        age = empAge;
    }

    /**
     * 设置designation的值
     *
     * @param empDesig
     */
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /**
     * 设置salary的值
     *
     * @param empSalary
     */
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /**
     * 打印信息
     */
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }

}
