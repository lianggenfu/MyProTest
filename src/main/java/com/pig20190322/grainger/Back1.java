package com.pig20190322.grainger;

public class Back1 {

    public void methodBack1(){
        Back2 back2 = new Back2();
        back2.methodBack2(new Back1());
        System.out.println("this is class Back1 method "+ this.getClass().toString());
    }

    public  void callBack(){
        System.out.println("this is class Back1 method : callBack" );
    }
}
