package com.company;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] test = {1, 2, 4, 5, 7};
        for (int i : test
                ) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        test = ArrayDemo.reverse(test);
        for (int i : test
                ) {
            System.out.print(i + " ");
        }

        System.out.println();
        String string = "helloworld";
        char[] data = string.toCharArray();
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
            data[x] -= 32;
            System.out.print(data[x] + " ");
        }
        System.out.println(new String(data));
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }
}
