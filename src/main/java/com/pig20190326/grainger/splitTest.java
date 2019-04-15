package com.pig20190326.grainger;

public class splitTest {

    public static void main(Test[] args) {
        String s = "/1/2/3/4";
        int a = s.split("/").length-1;

        System.out.println(a);
    }
}
