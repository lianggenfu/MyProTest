package com.pig20190410.jxufe;

public class meetting {
    public static void main(String[] args) {
        int n = 5;
        String s = "dfbfwefdsd";
        System.out.println(s.substring(1));
        System.out.println(test3(s));
    }
    private static int test1(int n){
        if(n>1) return test1(n-1)*n;
        return n;
    }
    private static String test2(String s){
        if(s.length()>1) return test2(s.substring(1))+s.charAt(0);
        return s;
    }
    private static String test3(String s){
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse().toString();
    }
}
