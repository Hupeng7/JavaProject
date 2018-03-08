package com.company;

/**
 * @author Administrator
 * @date 2018/3/6 0006
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] intary = {99, 12, 232, 5678, 213, 1321};
        int no = 5678;
        int i = 0;
        boolean found = false;
        for (; i < intary.length; i++) {
            if (intary[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(no + "元素的索引位置在:" + i);
        } else {
            System.out.println(no + "元素不在数组中");
        }
    }
}
