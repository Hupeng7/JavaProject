package com.company;

/**
 * @author Administrator
 * @date 2018/2/11 0011
 */
public class StringDemo {
    public static void main(String[] args) {
        String site = "www.google.com";
        int length = site.length();
        System.out.println("site's length is :" + length);

        System.out.println("我的名字是".concat("菜鸟"));

        System.out.printf("浮点型变量的值为" +
                "%f,整型变量的值为" +
                " %d,字符串变量的值为" +
                "is %s", 1.2, 4, "hello world");

        System.out.println();
        String fs;
        fs = String.format("浮点型变量的值为" +
                "%f,整型变量的值为" +
                " %d,字符串变量的值为" +
                " %s", 1.2, 4, "hello world again");
        System.out.println(fs);

        StringBuffer stringBuffer = new StringBuffer("谷歌官网:");
        stringBuffer.append("www");
        stringBuffer.append(".google");
        stringBuffer.append(".com");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
    }
}
