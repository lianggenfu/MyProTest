package com.pig20190322.grainger;

public class Back2 {

    public void methodBack2(Back1 back1){
        System.out.println("this is class Back2 method "+ this.getClass().toString());
        back1.callBack();
    }
}
