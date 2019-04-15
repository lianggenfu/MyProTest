package com.pig20190329.home;

public class TryCatch2Test {

    public static void main(String[] args) {
        System.out.println("return value : " +getValue());
    }

    public static int getValue(){
        try{
            int a = 4/0;
            return 0;
        }catch (Exception e){
            e.getMessage();
            return 2;
        }
        finally {
            return 1;
        }
    }
}
