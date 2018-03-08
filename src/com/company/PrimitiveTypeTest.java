package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 * 基本类型  包装类最小值 最大值
 */
public class PrimitiveTypeTest {
    public static void main(String[] args) {
        //byte
        System.out.println("*==========*==========*");
        System.out.println("基本类型 byte 二进制位数:" + Byte.SIZE);
        System.out.println("包装类 java.lang.Byte");
        System.out.println("最小值:" + Byte.MIN_VALUE);
        System.out.println("最大值:" + Byte.MAX_VALUE);

        //short
        System.out.println("*==========*==========*");
        System.out.println("基本类型 short 二进制位数:" + Short.SIZE);
        System.out.println("包装类 java.lang.Short");
        System.out.println("最小值:" + Short.MIN_VALUE);
        System.out.println("最大值:" + Short.MAX_VALUE);

        //int
        System.out.println("*==========*==========*");
        System.out.println("基本类型 int 二进制位数:" + Integer.SIZE);
        System.out.println("包装类 java.lang.Integer");
        System.out.println("最小值:" + Integer.MIN_VALUE);
        System.out.println("最大值:" + Integer.MAX_VALUE);

        //long
        System.out.println("*==========*==========*");
        System.out.println("基本类型 long 二进制位数:" + Long.SIZE);
        System.out.println("包装类 java.lang.Long");
        System.out.println("最小值:" + Long.MIN_VALUE);
        System.out.println("最大值:" + Long.MAX_VALUE);

        //double
        System.out.println("*==========*==========*");
        System.out.println("基本类型 double 二进制位数:" + Double.SIZE);
        System.out.println("包装类 java.lang.Double");
        System.out.println("最小值:" + Double.MIN_VALUE);
        System.out.println("最大值:" + Double.MAX_VALUE);

        //char
        System.out.println("*==========*==========*");
        System.out.println("基本类型 char 二进制位数:" + Character.SIZE);
        System.out.println("包装类 java.lang.Character");
        System.out.println("最小值:" + (int) Character.MIN_VALUE);
        System.out.println("最大值:" + (int) Character.MAX_VALUE);

        System.out.println("*==========*==========*");
        System.out.println("int 128 类型转换 byte:" + (byte) 128);
        System.out.println("浮点数到整数:" + (int) 23.7);
        System.out.println("浮点数到整数:" + (int) -45.89f);

        System.out.println("*==========*==========*");
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值==>" + i1);
        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于==>" + i2);
    }
}
