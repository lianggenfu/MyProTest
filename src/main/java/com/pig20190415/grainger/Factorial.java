package com.pig20190415.grainger;

import java.math.BigDecimal;

public class Factorial {

    private static int count = 0;

    public static void main(String[] args) {
        double n = 15;
        double sum = test3(n);
        BigDecimal bigDecimal = new BigDecimal(sum);

        System.out.println("sum: "+ bigDecimal.toString());
    }

    //for计算阶乘
    private static int test1(int p0) {
        int sum = 1;
        for(int i = p0; i>0;i--){
            sum *= i;
        }
        return sum;
    }
    //递归计算阶乘
    private static int test2(int po){
        if(po>1) return test2(po-1)*po;
        return po;
    }

    //递归计算阶乘（double)
    private static double test3(double po){
        if(po>1) return test3(po-1)*po;
        return po;
    }

    //计算100的阶乘尾巴有多少个0
    private static double test4(double po){
        if(po>1){
            count += count(po);
            return test4(po-1)*po;
        }
        return po;
    }

    private static int count(double po) {
        String s = String.valueOf(po);
        if(s.charAt(s.length())=='0'){
            count++;
            return count(Double.parseDouble(s.substring(s.length()-1)));
        }
        return 0;
    }
}
