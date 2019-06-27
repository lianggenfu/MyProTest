package com.pig20190626.home;

import java.util.Arrays;
import java.util.Iterator;

public class algorithm {

    public static void main(String[] args) {

        int[] array = {21,3,5,56,2,23,45,98};

        Arrays.sort(array);

        display(array);

        System.out.println("sadasd");
    }

    private static void display(int[] array) {
        for (int temp : array){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
}
