package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("菜鸟1号");
        Employee empTwo = new Employee("菜鸟2号");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        System.out.println("*==========*==========*");
        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
