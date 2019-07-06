package com.pig201907.pudonglibrary;

public class StringTest {

    public static void main(String[] args) {
        String str = "qwe";
        String str1 = new String("qwe");
        //String str2 = new String("qwe");
        System.out.println(str.hashCode()+" "+str1.hashCode());

        str = "qwe"+"sdf";
        System.out.println(str.hashCode());

        Integer a = 2000;
        Integer b = new Integer(2000);
        System.out.println(a.hashCode()+" "+b.hashCode());

        Character c = 'c';

        Object d = 'c';
        System.out.println(d.hashCode());

    }
}
