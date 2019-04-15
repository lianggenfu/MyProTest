package com.pig20190327.grainger;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        String value = "6.23E+14";

        //创建BigDecimal对象，把科学计数转成数字
        BigDecimal bigDecimal = new BigDecimal(value);

        //Long l = new Long(value);

        //转成最终要的数字字符串
        String res = bigDecimal.toPlainString();

        System.out.println(res);

       // System.out.println(l);
    }
}
