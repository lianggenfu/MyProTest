package com.pig201907.pudonglibrary.starkAndQueue;

public class Error {

    public static void cacl(){
        try{
            int a = 10;

            int b = a/0;

            System.out.println("a = "+a+" b = "+b);

        }catch (Exception e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new Exception();
        }
        finally {
            System.out.println("the program is end ！");
        }
    }


    public static void main(String[] args) throws Exception {

        try{
            int a = 10;

            int b = a/0;

            System.out.println("a = "+a+" b = "+b);

        }catch (Exception e){
            //System.out.println(e.getMessage());
           // e.printStackTrace();
            //throw new Exception();
        }
        finally {
            System.out.println("the program is end ！");
        }
    }
}
