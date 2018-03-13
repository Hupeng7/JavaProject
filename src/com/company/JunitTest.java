package com.company;

import org.junit.Test;

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

    private String CheckLogin() {
        String s1 = "www.baidu.com";
        String s2 = "www.baidu.com";
        String s3 = "www.baidu.com";
        String s4 = "www.baidu.com";
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
