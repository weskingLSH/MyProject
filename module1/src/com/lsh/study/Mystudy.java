package com.lsh.study;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//单行注释
public class Mystudy {


    private static String str;
    private static SimpleDateFormat sdf;

    public static void main(String[] args) {
        System.out.println("hello java!");
        test1();
    }

    public static void test1() {
        //region Description
        str = "洗涤费功夫";
        try {
            FileInputStream in = new FileInputStream("d://web.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        //endregion
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String dateStr = sdf.format(date);
        System.out.println("==========啥地方法规=" + str);
        System.out.println("dateStr=====" + dateStr);
        getList();

    }

    private static void getList() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(0,12);
        list.add(1, 123);
        System.out.println(list);
    }
}
