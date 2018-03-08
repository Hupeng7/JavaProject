package com.company;

/**
 * @author Administrator
 * @date 2018/3/1 0001
 */
public class toMap {
    public static void main(String[] args) {
        String[] values = {"a", "b", "c", "d"};
        String valueStr = "";
        for (int i = 0; i < values.length; i++) {
            valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + "|";
        }
        //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
        System.out.println(valueStr);
    }
}
