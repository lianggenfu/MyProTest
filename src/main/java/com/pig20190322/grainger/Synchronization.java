package com.pig20190322.grainger;

/*同步调用

同步调用是最基本的调用方式，对象b中的方法直接调用对象a的方法，这个时候程序会等待对象a的方法执行完返回结果之后才会继续往下走。

* */

public class Synchronization {

    public static void main(String[] args) {

        Sync2 sync2 = new Sync2();
        sync2.methodB();
    }
}

/*
* result:
*           this is Class A method !
*           this is Class B Method !
* */
