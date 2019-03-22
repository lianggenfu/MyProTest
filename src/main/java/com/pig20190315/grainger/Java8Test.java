package com.pig20190315.grainger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test {

    public static void main(String[] args) {


        List<String> alpha = Arrays.asList("a","Df","d","w");

        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        /* before  java 8*/
        for (String s : alpha){
            System.out.print(s.toUpperCase()+" ");
        }
        System.out.println();

        for (Integer integer : numList){
            System.out.print(integer * 2 +" ");
        }
        System.out.println();


        /*  java 8 */
        List<String> collectAlpha = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collectAlpha);

        List<Integer> collect = numList.stream().map(n -> n*2).collect(Collectors.<Integer>toList());

        System.out.println(collect);
    }
}
