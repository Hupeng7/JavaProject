package com.company;

/**
 * @author Administrator
 * @date 2018/2/11 0011
 */
public class DrawDemo {
    int a, b;
    int h;
    int i, j;

    public void draw(int h) {
        for (i = 1; i <= h; i++) {
            for (j = 1; j <= h; j++) {
                if (j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1) / 2 || j == (3 * h + 1) / 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawDemo dd = new DrawDemo();
        int a = 35;
        dd.draw(a);
    }
}
