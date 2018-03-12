package com.company;

import org.junit.Test;

/**
 * @author Administrator
 * @date 2018/3/12 0012
 */
public class JunitTest {
    @Test
    public void testOne() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("==>test " + i + " time");
        }
    }

}
