package com.pig20190415.grainger;

public class DoubleTest {

    private static int count = 0;

    public static void main(String[] args) {
        int number = new Integer(0);
        String s = String.valueOf(number);
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        int index = s.indexOf('0');
        System.out.println(index);

        //System.out.println("count : "+count(d));
    }

    private static String test(int num){
        String s = String.valueOf(num);
        int index = s.indexOf('0');
        if(index<0) {

        }else{
            count += 1;
            return null;
        }
        return  null;
    }
}
