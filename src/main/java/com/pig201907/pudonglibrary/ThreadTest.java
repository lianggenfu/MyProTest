package com.pig201907.pudonglibrary;

import java.util.concurrent.Semaphore;
/*
* 多线程基础，8个工人，5台机器，每个工人同时只能使用一台机器
* 上一个工人使用结束才能被下一个工人使用
* */
public class ThreadTest {

    public static void main(String[] args) {
        int N = 8;
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < N; i++){
            new Worker(i,semaphore).start();
        }
    }

    static class Worker extends Thread{
        private int num;
        private Semaphore semaphore;

        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人"+this.num+"占用一个机器正在生产...");
                Thread.sleep(2000);
                System.out.println("工人"+this.num+"释放出机器");
                semaphore.release();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
