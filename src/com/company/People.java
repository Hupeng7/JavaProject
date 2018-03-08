package com.company;

import java.io.*;

/**
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class People implements Serializable {
    String name;
    transient Integer age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

