package byteDance;

import java.util.Scanner;

public class exam2 {

    public static void main(String[] args) {
        //System.out.println("请输入单词个数：");
        Scanner input = new Scanner(System.in);
        //int num  =input.nextInt();
        System.out.println("请输入密文：");
        String message = input.next();
        //String result = resove(num,message);
        //String rs = cac(message);
        //System.out.println("解密后原文为： "+rs);
        cac(message);
    }

    private static String resove(int num, String message) {
        String[] strings = message.split(" ");
        String rs = null;
        for (String s : strings){
            //rs+=(cac(s)+" ");
        }
        return rs;
    }

    private static void cac(String s) {
        String head = "";  //头
        String tail = "";  //尾
        String rs = "";

        //acegfdb
        head = s.substring(0,(s.length()+1)/2);
        tail = s.substring((s.length()+1)/2,s.length());

        System.out.println(head+" "+tail);

        for (int i = 1; i<=s.length();i+=2){
            if(i%2!=0){
                rs+=s.charAt(i-1);
            }
        }

        System.out.println(rs);
        /*
        for (int j= s.length(); j>0;j-=2){
            temp+=s.charAt(j-1);
        }
        return temp;*/
    }
}
