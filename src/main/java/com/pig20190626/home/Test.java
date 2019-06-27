package com.pig20190626.home;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    /*public static void main(String[] args) throws UnsupportedEncodingException {
        String s = new String("ISO08859-1".getBytes(),"GB2312");
        System.out.println(s);
    }*/

    /*public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }*/
    //  pongping

    /*public static void main(String[] args) {
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }*/
    //true
    //true

    /*public static void main(String[] args) {
        Integer a = new Integer(0);
        int b = 0;

        System.out.println(a instanceof Integer);
    }*/
    //true


    /*static int x=10;
    static {x+=5;}
    public static void main(String[] args) //4
    {
        System.out.println("x="+x);
    }
    static{x/=3;};*/


    public static void main(String[] args) {
        //整数反转
        Scanner in = new Scanner(System.in);
        System.out.println("输入需要反转的整数： ");
        int num = in.nextInt();
        int result = invers(num);
        System.out.println(num+"反转后为："+result);
    }

    private static int invers(int num) {
        int result = 0;
        while (num>1){
            int temp = result*10+num%10;
            if(temp/10!=result){
                return 0;
            }
            result = temp;
            num/=10;
        }
        return result;
    }
}
