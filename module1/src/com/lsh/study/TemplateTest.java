package com.lsh.study;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-05 10:34
 */
public class TemplateTest {
    private static final String AA="qer";
   public static final String BB="bb";
   public static final int qq =12 ;
   public static final String ee = "123";
   private static final int r=12;
   private static final String tt = "rr";
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        int i=0;
        String a="123";
        System.out.println("i = " + i);
        System.out.println("a = " + a);
        System.out.println("TemplateTest.main");
        String str="asdgg";
        System.out.println(str);
        List list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        for (Object o : list) {
            System.out.println(o);
        }
        for (int j = 0; j < list.size(); j++) {
            Object arg = list.get(j);
            System.out.println(arg);

        }
        for (Object o : list) {
            
        }
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            
        }
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }

    }


    public void testContrl(){

        System.out.println("git success");
    }


}
