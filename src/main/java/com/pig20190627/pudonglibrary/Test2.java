package com.pig20190627.pudonglibrary;

public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        String s3 = "java";
        String s4 = "java";

        String s5 = "home";
        String s6 = "javahome";
        String s7 = s3+s5;

        //System.out.println(s1.equals(s2)+" "+(s1==s2));
        //true false  equals比较的是字符串内容，==比较的是内存地址

        //System.out.println(s4==s3);
        //true  s3创建了java字符串，s4发现需要创建的还是java便不会再开辟内存空间了，而是直接将s3创建的java字段地址赋给s4

        System.out.println(s6==s7);
        //false 内存地址比较

        System.out.println(s6.equals(s7));

    }
}
