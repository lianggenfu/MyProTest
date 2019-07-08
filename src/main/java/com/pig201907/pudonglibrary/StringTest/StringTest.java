package com.pig201907.pudonglibrary.StringTest;

public class StringTest {

    public static void main(String[] args) {
        /*String a = "test";
        StringBuffer stringBuffer = new StringBuffer("sdf");
        System.out.println(stringBuffer.hashCode());
        stringBuffer = new StringBuffer(stringBuffer+"dsd");
        System.out.println(stringBuffer.hashCode());

        StringBuilder stringBuilder = new StringBuilder("sdf");

        System.out.println(a.hashCode());
        String b = new String("test");
        a = a + "s";
        System.out.println(a.hashCode());
        System.out.println(a.equals(b)+" "+(a==b));*/

        String a = "agdsadwer";
        String b = new String("ABC");
        StringBuffer stringBuffer = new StringBuffer(a);
        //System.out.println(stringBuffer.reverse());

        String rs = revese(b);
        System.out.println(rs+" "+rs.length());
    }

    private static String revese(String a) {
        if(a.length()>1)
            return revese(a.substring(0))+a.charAt(0);
        else return a;
    }

    /*public static void main(String[] args) {
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

    }*/
}
