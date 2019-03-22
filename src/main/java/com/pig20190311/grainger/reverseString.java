package com.pig20190311.grainger;


/*反转串
我们把“cba”称为“abc”的反转串。
求一个串的反转串的方法很多。下面就是其中的一种方法，代码十分简洁（甚至有些神
秘），请聪明的你通过给出的一点点线索补充缺少的代码。把填空的答案（仅填空处的答案，
不包括题面）存入考生文件夹下对应题号的“解答.txt”中即可。*/

public class reverseString {

    public static String reverseString(String x)
    {
        if(x==null || x.length()<2) return x;
        //return  + x.charAt(0);
        return reverseString(x.substring(1))+x.charAt(0);
    }

    public static void main(String[] args) {
        String s="abcswecsdcsdc";
        System.out.println(reverseString(s));
    }
}
