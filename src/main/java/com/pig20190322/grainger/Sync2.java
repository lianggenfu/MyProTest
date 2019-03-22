package com.pig20190322.grainger;

public class Sync2 {

    public void methodB() {

        Sync1 sync1 = new Sync1();
        sync1.methodA();
        System.out.println("this is Class Sync2 Method !");
    }
}
