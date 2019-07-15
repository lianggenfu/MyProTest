package byteDance;

import java.util.Scanner;

/*
* bytedance 解密算法题
*
* 加密法则 ：
*
*  1. 对每个单词加密
*  2. 不改变单词的大小写
*  3. 针对每个单词，从第一个字母开始标序号，到最后一个字母，
*  取出所有序号为奇数的字母，连起来加密后单词的前半部分；
*  再倒着取出所有序号为偶数的字母，作为单词的后半部分。
*  4.例如，abcdefg 加密后的前半部分为 aceg ，后半部分为 fdb ,
*  整个字符串加密后为: acegfdb
*
*
* */
public class Byte2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入单词个数: ");
        int num = input.nextInt();

        System.out.println("请输入密文: ");  //wloemce to dneyetbca
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();

        String[] strings = message.split(" ");
        StringBuilder rs = new StringBuilder("");
        for (String s : strings){
            rs.append(cac(s)+" ");
        }
        System.out.println("解密结果为:"+rs);
    }

    private static String cac(String message) {
        String head = message.substring(0,(message.length()+1)/2);
        String tail = message.substring((message.length()+1)/2);
        StringBuilder stringBuilder = new StringBuilder("");
        //System.out.println(head+" "+tail);
        int i = 0, j = tail.length()-1;
        while(i<head.length()||j>=0){
            stringBuilder.append(head.charAt(i));
            if(j>=0) {
                stringBuilder.append(tail.charAt(j));
            }
            i++;
            j--;
        }
        return stringBuilder.toString();
    }
}
