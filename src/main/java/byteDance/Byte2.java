package byteDance;

import java.util.Scanner;

public class Byte2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入单词个数: ");
        int num = input.nextInt();

        System.out.println("请输入密文: ");  //wloemce to dneyetbca
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();


        String[] strings = message.split(" ");
        String rs = "";
        for (String s : strings){
            rs+=cac(s)+" ";
        }
        System.out.println("解密结果为： "+rs);
    }

    private static String cac(String message) {
        String head = message.substring(0,(message.length()+1)/2);
        String tail = message.substring((message.length()+1)/2);
        String rs = "";
        //System.out.println(head+" "+tail);
        int i = 0, j = tail.length()-1;
        while(i<head.length()||j>=0){
            rs += head.charAt(i);
            if(j>=0) {
                rs += tail.charAt(j);
            }
            i++;
            j--;
        }
        return rs;
    }
}
