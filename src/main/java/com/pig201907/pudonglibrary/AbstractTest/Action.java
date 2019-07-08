package com.pig201907.pudonglibrary.AbstractTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;

public class Action {

    public static void main(String[] args) {
        Dog dog = new Dog();

        Animals animals = new Animals() {
            @Override
            public void eat() {

            }
        };
        File file = new File("C:\\我的文件\\pic");
        System.out.println(file.exists());

        ArrayList arrayList = new ArrayList();
    }
}
