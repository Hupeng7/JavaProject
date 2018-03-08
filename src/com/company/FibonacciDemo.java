package com.company;

/**
 * @author Administrator
 * @date 2018/3/6 0006
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        long count = 10;
        for (int i = 0; i < count; i++) {
            System.out.printf("Fibonacci of %d is:%d\n", i, fibonacci(i));
        }
    }

    public static long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
