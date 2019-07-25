package com.pig201907.pudonglibrary.starkAndQueue;

public class Test {

    /*public static void main(String[] args){
        Error error = new Error();

        error.cacl();
    }*/

    public static void main(String[] args) {
        method1();
       // method2();
       //Node node = new Node();
    }

    private static void method2() {
        int a = 1/0;
    }

    private static void method1(){
        try{
           // int a = 1/0;
            throw new Exception("sdfs");
            //System.out.println(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(2);
        }finally {
            System.out.println(3);
        }

    }


}
