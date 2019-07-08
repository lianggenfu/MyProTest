package com.pig201907.pudonglibrary.AbstractTest;

public class Dog extends Animals{

    @Override
    public void eat() {
        System.out.println("dog need to eat");
    }

    @Override
    public void breath() {
        super.breath();
    }
}
