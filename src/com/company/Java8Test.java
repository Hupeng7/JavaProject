package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/8 0008
 */
public class Java8Test {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>() {{
            add("Google");
            add("Runoob");
            add("Taobao");
            add("Baidu");
            add("Jingdong");
        }};

        List<String> names2 = new ArrayList<String>() {{
            add("Google");
            add("Runoob");
            add("Taobao");
            add("Baidu");
            add("Jingdong");
        }};

        Java8Test test = new Java8Test();

        System.out.println("使用Java7语法： ");
        test.sortUsingJava7(names1);
        System.out.println(names1);

        System.out.println("使用Java8语法： ");
        test.sortUsingJava8(names2);
        System.out.println(names2);


    }


    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
    }
}
