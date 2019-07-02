package com.pig201907.pudonglibrary.Test;

public class Person {

    private String name;
    private int age;
    private String sex;

    final public void work(){ //final 修饰的最终方法 可以被子类继承，但不能被重写
        System.out.println("a person can do work");
    }

    public void eat(){   //普通方法  可以被子类继承、重写
        System.out.println("a person need to eat");
    }

    public static void sleep(){
        System.out.println("a person need to sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
