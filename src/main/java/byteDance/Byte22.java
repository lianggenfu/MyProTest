package byteDance;

import java.util.Scanner;

public class Byte22 {

    public static void main(String[] args) {
        String s1,s2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        s1=scanner.next();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("请输入第二个字符串：");
        s2=scanner1.nextLine();
        System.out.println("输入的字符串是："+s1+s2);
    }
}
