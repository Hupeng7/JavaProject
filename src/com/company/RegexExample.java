package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class RegexExample {
    private static final String REGEX = "\\bcat\\b";
    private static final String  INPUT = "cat cat cat cattle cat";

    public static void main(String[] args) {
        String content = "I am noob "+"from runoob.com";

        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'runoob' 子字符串？"+isMatch);

        String line = "This order was placed for QT3000!OK?";
        String patternOne = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(patternOne);
        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Found value: "+ m.group(0));
            System.out.println("Found value: "+ m.group(1));
            System.out.println("Found value: "+ m.group(2));
            System.out.println("Found value: "+ m.group(3));
        }else{
            System.out.println("NO MATCH");
        }

        System.out.println("regex 方法: ");
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher= p.matcher(INPUT);
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+matcher.start());
            System.out.println("end(): "+matcher.end());
        }


    }
}
