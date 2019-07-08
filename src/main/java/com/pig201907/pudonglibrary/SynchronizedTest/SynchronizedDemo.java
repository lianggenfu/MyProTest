package com.pig201907.pudonglibrary.SynchronizedTest;

public class SynchronizedDemo implements Runnable{

    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            Thread thread = new Thread(new SynchronizedDemo());
            thread.start();
        }
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("result: "+count);
    }

    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            count++;
            System.out.println("i: "+i+" count: "+count);
        }
    }
}
