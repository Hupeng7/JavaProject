package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date:" + sdf.format(date));

        System.out.printf("全部日期和时间信息:%tc%n", date);
        System.out.printf("年-月-日格式:%tF%n", date);
        System.out.printf("月/日/年格式:%tD%n", date);
        System.out.printf("HH:MM:SS PM格式（12小时制）:%tr%n", date);
        System.out.printf("HH:MM:SS格式 （24小时制）:%tT%n", date);
        System.out.printf("HH:MM格式（24小时制）:%tR", date);

        System.out.println();
        System.out.printf("%1$s %2$tB %2$td,%2$tY", "Due date:", date);
        System.out.println();
        System.out.printf("%s %tB %<te,%<tY", "Due date:", date);

        String str = String.format(Locale.US, "英文月份简称:%tb", date);
        System.out.println(str);

        System.out.printf("本地月份简称:%tb%n", date);
        str = String.format(Locale.US, "英文月份全程:%tB", date);
        System.out.println(str);
        System.out.printf("本地月份全程:%tB%n", date);

        str = String.format(Locale.US, "英文星期的简称:%ta", date);
        System.out.println(str);
        System.out.printf("本地月份全程:%tB%n", date);

        str = String.format(Locale.US, "英文星期的简称:%ta", date);
        System.out.println(str);

        System.out.printf("本地星期的简称:%tA%n", date);

        System.out.printf("年的前两位数字（不足两位前面补0）:%tC%n", date);

        System.out.printf("年的后两位数字（不足两位前面补0）:%ty%n", date);

        System.out.printf("一年中的天数（即年的第几天）:%tj%n", date);

        System.out.printf("两位数字的月份（不足两位前面补0）:%tj%n", date);

        System.out.printf("两位数字的日（不足两位前面补0）:%td%n", date);

        System.out.printf("月份的日（前面不补0）:%te", date);

        System.out.println("解析字符串为时间");

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");

        Date t;
        try {
            long startTime = System.currentTimeMillis();
            t = sf.parse(input);
            System.out.println(t);

            System.out.println("java sleep 3 seconds");
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);
            System.out.println(new Date() + "\n");
            long endTime = System.currentTimeMillis();
            long diff = endTime - startTime;
            System.out.println("Difference is: " + diff);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Unparseable using" + sf);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Got an exception!");
        }

    }
}
