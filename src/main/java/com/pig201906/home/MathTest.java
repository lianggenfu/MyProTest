package com.pig201906.home;

public class MathTest {

    public static void main(String[] args) {
        float num1 = Math.round(1.5);

        float num2 = Math.round(-1.5);

        System.out.println(num1+" "+num2);
        // 2.0    -1.0

        float num3 = Math.round(-1.6);
        System.out.println(num3);
        //-2.0


        //总结：利用坐标轴，偏向哪边往哪边取整
    }
}
