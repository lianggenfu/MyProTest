package com.pig20190330.home;

import sun.awt.util.IdentityArrayList;

import java.util.*;

public class TryCatchTest {

    private static void test1(){    //12
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }

    private static void test2(){    //123
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            // throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }

    private static void test3(){   //i:1 j:0
        int i=0;
        int j=0;
        if((++i>0)||(++j>0)){
            System.out.println("i:"+i+" j:"+j);
        }
    }
    /*
    *    ++i的优先级高于> 先执行++i  再比较（++i)和 0  ，条件判断中或连接如果前者为true。结果直接反回true，后面的不执行
    * */

    private static void test4(){
        List list = new ArrayList();
        Map map = new HashMap();
        Set set = new HashSet();
        Iterable iterable = new IdentityArrayList();
    }

    private static void test5(){
        Integer a = new Integer(9);
        Integer b = new Integer(9);
        Long c = new Long(9);
        System.out.println(a==b);
        //System.out.println(a==c);
        System.out.println(a.equals(c));

        int d = new Integer(9);
        if(a.equals(d)){
            System.out.println("yes");
        }
    }

    private static void test6(){
        int a;
        a = 6;
        System.out.print(a);
        System.out.print(a++);
        System.out.print(a);
    }

    public static void main(String[] args){
        test6();
    }


    /*内部类*/
    private class txl{
        private int name;
    }
}
