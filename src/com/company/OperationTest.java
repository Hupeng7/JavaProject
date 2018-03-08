package com.company;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class OperationTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a+b= " + (a + b));
        System.out.println("a-b= " + (a - b));
        System.out.println("a*b= " + (a * b));
        System.out.println("b/a= " + (b / a));
        System.out.println("b%a= " + (b / a));
        System.out.println("c%a= " + (c % a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));

        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));

        int x = 10;
        int x2 = 10;
        int x3 = 10;
        final int count = 12;
        while (x < count) {
            System.out.println("value of x : " + x);
            x++;
        }

        do {
            System.out.println("do while value of x2 : " + x2);
            x2++;
        } while (x2 < count);

        for (int i = 10; i < count; i++) {
            System.out.println("for value of x3 : " + x3);
            x3++;
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for (int n : numbers) {
            if (n == 30) {
                break;
            }
            System.out.print(n + ",");
        }

        System.out.println();
        String[] names = {"James", "Kobe", "Jordan", "Durant"};
        for (String name : names) {
            if (("Jordan").equals(name)) {
                continue;
            }
            System.out.print(name + ",");
        }

        System.out.println();
        int xx = 9;
        for (int i = 1; i <= xx; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }

        if (x < count) {
            System.out.println("this is a if");
        } else {
            System.out.println("this is a else");
        }

        switch (x) {
            case 10:
                System.out.println("x is 10");
                break;
            case 11:
                System.out.println("x is 11");
                break;
            case 12:
                System.out.println("x is 12");
                break;
            default:
                System.out.println("x is another number");
                break;
        }

    }
}
