package com.pig20190415.grainger;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int sum = test2(n);
        System.out.println("sum: "+sum);
    }

    private static int test1(int p0) {
        int sum = 1;
        for(int i = p0; i>0;i--){
            sum *= i;
        }
        return sum;
    }

    private static int test2(int po){
        if(po>1) return test2(po-1)*po;
        return po;
    }
}
