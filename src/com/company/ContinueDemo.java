package com.company;

/**
 * @author Administrator
 * @date 2018/3/7 0007
 */
public class ContinueDemo {
    public static void main(String[] args) {
        StringBuffer searchStr = new StringBuffer("hello how are you.");
        int length = searchStr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchStr.charAt(i) != 'o') {
                continue;
            }
            count++;
            searchStr.setCharAt(i, 'o');
        }
        System.out.println("发现" + count + "个 o 字符");
        System.out.println(searchStr);

    }
}
