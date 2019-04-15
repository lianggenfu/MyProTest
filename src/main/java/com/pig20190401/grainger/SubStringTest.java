package com.pig20190401.grainger;

public class SubStringTest {

    public static void main(String[] args) {

        String s = "12/1/8/34/197/1280/";
        int count1 = stringCount(s);
        int count2 = niceMethod(s);
        int count3 = Okami(s);
        int count4 = sourceCode(s);
        System.out.println("stringCount: "+count1 +" niceMethod: "+count2+" Okami: "+count3+ " sourceCode: "+count4);
    }

    //我写的辣鸡代码
    public static int stringCount(String s){
        int count = 0;

        while (s.contains("/")) {
            int index = s.indexOf("/");
            s = s.substring(index+1);
            count++;
        }
        return count;
    }

    //看不下去进行代码优化
    private static int niceMethod(String s){
        int count = 0,index = 0;
        while (index>=0) {
            index = s.indexOf("/",index+1);
            count++;
        }
        return count;
    }

    //大神优化
    private static int Okami(String s){
        int count = 0;
        for (int index = s.indexOf("/"); index >= 0; count++)
            index = s.indexOf("/", index + 1);
        return count;
    }

    //源码碾压
    private static int sourceCode(String s){
        return s.split("/").length-1;
    }

}
