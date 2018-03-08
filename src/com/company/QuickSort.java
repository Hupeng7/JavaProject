package com.company;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * @author Administrator
 * @date 2018/3/8 0008
 */
public class QuickSort {
    //int[] arr = {64, 31, 56, 89, 5, 88, 54};

    public QuickSort(int[] arr) {
        quick(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int getMiddle(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

    public void _quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);
            _quickSort(arr, low, middle - 1);
            _quickSort(arr, middle + 1, high);
        }
    }

    public void quick(int[] arr2) {
        if (arr2.length > 0) {
            _quickSort(arr2, 0, arr2.length - 1);
        }
    }





    /*public static void main(String[] args) {
        int low = 0;
        int high = 7;
        int[] arr = {12, 32, 13, 43, 6, 42, 78, 2};
        sort(arr, low, high);
    }

    public static void sort(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];
        while (l < h) {
            while (l < h && arr[h] > povit) {
                h--;
            }
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit) {
                l++;
            }

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        print(arr);
        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) {
            sort(arr, low, l - 1);
        }
        if (h < high) {
            sort(arr, l + 1, high);
        }
    }*/
}


