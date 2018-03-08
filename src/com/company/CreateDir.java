package com.company;

import java.io.File;

/**
 * @author Administrator
 * @date 2018/2/24 0024
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirName = "/tmp/file/test/";
        File d = new File(dirName);
        /*d.mkdirs();
        System.out.println("success");*/

        dirName = "/tmp";
        d = new File(dirName);
        if (d.isDirectory()) {
            System.out.println("目录:" + dirName);
            String[] s = d.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirName + " 不是一个目录");
        }
    }
}
