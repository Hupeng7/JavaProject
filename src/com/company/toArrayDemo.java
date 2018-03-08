package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class toArrayDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("谷");
                add("歌");
                add("www.google.com");
            }
        };
        String[] s1 = list.toArray(new String[0]);
        for (int i = 0; i < s1.length; i++) {
            String contents = s1[i];
            //System.out.print("s1第 " + i + " 个数是：" + s1[i]);
            //System.out.println(" ");
            System.out.print(contents);
            //System.out.println(" ");
        }
    }
}
