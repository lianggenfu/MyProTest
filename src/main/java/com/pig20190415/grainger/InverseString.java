package com.pig20190415.grainger;

public class InverseString {

    public static void main(String[] args) {
        String s = "sdfjwheugaqwq";
        String reverseString = test2(s);
        System.out.println("the reversString of "+ s+" is :"+reverseString);
    }

    private static String test2(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse().toString();
    }

    private static String test1(String s) {
        if(s.length()>1) return test1(s.substring(1))+s.charAt(0);
        return s;
    }


}
