package com.pig20190329.home;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("please input a String :");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word = revent(word);
        System.out.println("the revent of your string is :" + word);

        //File file = new File("werwer");
    }

    public static void tets(){
        System.out.println("txl");
    }

    public static String revent(String word){

        return (word.length()>1)?revent(word.substring(1))+word.charAt(0):word;
    }
}
