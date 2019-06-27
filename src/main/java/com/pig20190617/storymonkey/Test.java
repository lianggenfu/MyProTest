package com.pig20190617.storymonkey;

public class Test {

    public static void main(String[] args) {

        for(int i = 1; i<9; i++){
            for (int j = i; j<=i ; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
