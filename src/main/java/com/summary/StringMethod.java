package com.summary;

public class StringMethod {

    private static String testString = "this is my first test !";

    private static int index = 2;

    public static void main(String[] args) {
        subStringTest2(testString,index,index+1);
    }

    /*subString 方法是从哪1开始计数*/

    private static void subStringTest(String s, int index){
        System.out.println(s.substring(index));   //  is is my first test !
    }

    private static void subStringTest2(String s, int start, int end){
        System.out.println(s.substring(start,end));  //  i
    }
}
