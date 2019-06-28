package com.pig20190627.pudonglibrary;

public class Test {

    public static void main(String[] args) {
        int a;

        //System.out.println(a); 提示需要初始化a的值

        Person person = new Person();
        System.out.println(person.age);
    }

    public static class Person{
        private int age;
        private Integer length;
    }
}
