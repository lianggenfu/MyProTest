package com.pig201907.pudonglibrary.TaskTest;

import java.util.Scanner;
/*
*    n个人围成一个圈，按顺序编号(1-n), 从一号开始报数（1-3），凡报到三的人退出圈子，
*    退出圈子的下一位继续开始从1报数，问最后留下来的人的编号。
*
*
* */
public class Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入总人数：");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num; i++){
            arr[i] = i+1;
    }
        int index = 0;
        int sum = 0;

        while (sum>0){
            if(true){

                if(true){
                    sum = 0;
                    arr[index] = 0;
                    num--;
                }
            }
            index++;
            if(index == arr.length){
                index = 0;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                System.out.println("第"+(i+1)+"位留了下来");
            }
        }
    }
}
