package com.pig20190320.grainger;

public class StringTest {

    /*
    *
    * replace and contain
    * */
    private static String string = "h s张  三d偷 偷\\s 补、 ·肾sd\\wesds`ksds 被sdw sd发。现 了";

    public static void main(String[] args) {
        String[] index = {" ",".","\\","。","`","!","、","·","-"};
        for(int i=0;i<index.length;i++){
            int j=i;
            string = string.replace(index[i],"");
        }
        System.out.println(string);
    }
}
