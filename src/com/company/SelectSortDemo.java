package com.company;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = {20, 60, 51, 81, 285, 12, 165, 51, 81, 318, 186, 9, 70};
        System.out.println("-------------原数组---------------");
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + "-------------从大到小---------------");
        arr = toBig(arr);
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + "-------------从小到大---------------");
        arr = toSmall(arr);
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] toSmall(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = number;
                }
            }
        }
        return arr;
    }

    public static int[] toBig(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = number;
                }
            }
        }
        return arr;
    }
}
