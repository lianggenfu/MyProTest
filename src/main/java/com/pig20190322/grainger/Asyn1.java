package com.pig20190322.grainger;

public class Asyn1 extends Thread{

    public  void run(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("this is Class Asyn1 Method !");
    }
}
