package com.company;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class ArrayDemoOne {
    public static void output(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array, 5);
        System.out.println("填充数组:Arrays.fill(array,5):");
        ArrayDemoOne.output(array);

        Arrays.fill(array, 2, 4, 8);
        System.out.println("将数组的第2和第3个元素赋值为8:Arrays.fill(array,2,4,8):");
        ArrayDemoOne.output(array);

        int[] arrayOne = {7, 8, 3, 2, 12, 6, 3, 5, 4};
        Arrays.sort(arrayOne, 2, 7);
        System.out.println("对数组的第2个到第6个元素进行排序:Arrays.fill(array,2,7):");
        ArrayDemoOne.output(arrayOne);

        Arrays.sort(arrayOne);
        System.out.println("对整个数组进行排序:Arrays.sort(arrayOne):");
        ArrayDemoOne.output(arrayOne);

        System.out.println("比较数组元素是否相等:Array.equals(array,arrayOne):" + "\n" + Arrays.equals(array, arrayOne));

        int[] arrayTwo = arrayOne.clone();
        System.out.println("克隆后数组元素是否相等:Array.equals(arrayOne.arrayTwo):" + "\n" + Arrays.equals(arrayOne, arrayTwo));

        Arrays.sort(arrayOne);
        System.out.println("元素3在arrayOne中的位置:Array.binarySearch(arrayOne,3):" + "\n" + Arrays.binarySearch(arrayOne, 3));
        System.out.println("元素9在arrayOne中的位置:Array.binarySearch(arrayOne,9):" + "\n" + Arrays.binarySearch(arrayOne, 9));
    }
}
