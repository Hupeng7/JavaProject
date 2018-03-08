package com.company;

import java.util.Arrays;
import java.util.Date;

/**
 * @author Administrator
 * @date 2018/3/8 0008
 */
public class HelloTest {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        //int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        int[] arr = new int[]{43, 86, 6, 78, 98, 3, 67};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    /*public static void main(String[] args) {
        System.out.println("hello " + new Date());

        System.out.println("test01");

        System.out.println("test02");
        int[] arr = {64, 31, 56, 89, 5, 88, 54};
        QuickSort q = new QuickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }*/
}
