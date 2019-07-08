package com.pig201907.pudonglibrary.Test;


import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private String sex;

    final public void work(){ //final 修饰的最终方法 可以被子类继承，但不能被重写
        System.out.println("a person can do work");
    }

    final public void work(int age){
        System.out.println("重载一个final类");
    }

    public void eat(){   //普通方法  可以被子类继承、重写
        System.out.println("a person need to eat");
    }

    public static void sleep(){
        System.out.println("a person need to sleep");
    }
}
