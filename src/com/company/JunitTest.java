package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2018/3/12 0012
 */
public class JunitTest {
    @Test
    public void testOne() {
        String str = CheckLogin();
        System.out.println(str);

        for (int i = 1; i <= 5; i++) {
            System.out.println("==>test " + i + " time");
        }
    }

    @Test
    public void testTwo() {
        int[] arr = {1, 23, 3, 45, 4};
        for (int i :
                arr) {
            System.out.println("value of arr is " + i);
        }
    }

    private String CheckLogin() {
        String s1 = "www.baidu.com";
        String s2 = "www.baidu.com";
        String s3 = "www.baidu.com";
        String s4 = "www.baidu.com";
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 1; i <= 5; i++) {
            String name = "s" + i;
            System.out.println(name);
            map.put(name, "www.baidu.com");
        }

        System.out.println("map...");
        for (String key :
                map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }

        for (int i = 1; i <= 5; i++) {
            String name = "s" + i;
            System.out.println(new String("www.baidu.com"));
        }

        int a = 1;
        if (a > 0) {
            System.out.println("登录成功...");
            return "login success...";
        } else {
            System.out.println("登录不成功...");
            return "login fail...";
        }
    }
}
