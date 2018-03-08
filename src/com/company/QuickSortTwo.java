package com.company;

/**
 * @author Administrator
 * @date 2018/3/8 0008
 */
public class QuickSortTwo {
    private static void sort(int[] num, int low, int high) {
        if (high <= low) {
            return;
        } else if (high - low == 1) {
            if (num[low] > num[high]) {
                swap(num, low, high);
            }
        } else {
            int pivot = num[low];
            int left = low + 1;
            int right = high;
            while (left < right) {
                while (left < high) {
                    if (num[left] > pivot) {
                        break;
                    } else {
                        left++;
                    }
                }
                while (right > low) {
                    if (num[right] < pivot) {
                        break;
                    } else {
                        right--;
                    }
                }
                if (left < right) {
                    swap(num, right, left);
                }
            }
            swap(num, low, right);
            sort(num, low, right);
            sort(num, right + 1, high);
        }
    }

    private static void swap(int[] num, int i, int j) {
        int temp;
        temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{43, 86, 6, 78, 98, 3, 67};
        System.out.println("排序之前的数组为： ");
        print(arr);

        System.out.println();
        sort(arr, 0, arr.length - 1);
        System.out.println("排序之后的数组为： ");
        print(arr);
    }
}
