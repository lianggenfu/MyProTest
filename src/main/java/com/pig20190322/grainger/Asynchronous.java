package com.pig20190322.grainger;


/*
*    异步调用
*
*    对象b中的方法调用对象a的方法，程序并不需要等待对象a的方法返回结果值，直接继续往下走。
*
* */
public class Asynchronous {

    public static void main(String[] args) {

        Asyn2 asyn2 = new Asyn2();
        asyn2.methodAsyn2();

    }

}

/*
* result:
*           this is Class Asyn2 Method !
*           this is Class Asyn1 Method !
*
*           异步调用我们通常采用多线程的方法来达到目的
*
* */