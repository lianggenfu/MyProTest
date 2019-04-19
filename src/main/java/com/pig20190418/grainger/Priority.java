package com.pig20190418.grainger;

public class Priority {

    public static void main(String[] args) {
        int a = 1;
        if(a>0){
            System.out.println(a++);
        }
        if(a<5){
            System.out.println(++a);
        }
        if(a<4){
            System.out.println(++a);
        }
    }
}
