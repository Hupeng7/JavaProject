package com.company;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class sumVarargs {
    static int sum(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sum(new int[]{11, 22, 33,100});
        System.out.println("数字相加之和为:" + sum);
    }
}
