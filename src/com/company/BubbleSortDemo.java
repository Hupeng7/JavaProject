package com.company;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {26, 15, 29, 66, 99, 88, 36, 77, 111, 1, 6, 8, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "次排序结果:");
            for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a] + "\t");
            }
            System.out.println("");
        }
        System.out.println("最终排序结果为:");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + "\t");
        }
    }
}
