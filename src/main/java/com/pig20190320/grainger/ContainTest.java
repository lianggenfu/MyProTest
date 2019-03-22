package com.pig20190320.grainger;

public class ContainTest {

    private static String str =  "java";

    public static void main(String[] args) {
        String string = "ssdfwkefjavaksmdfwe";
        if(string.contains(str)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
