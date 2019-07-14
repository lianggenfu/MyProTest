package byteDance;

import java.util.Scanner;

public class SplitTest {

    public static void main(String[] args) {
        String s = "wloemce to dneytbca";
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String[] strings = s1.split(" ");
        System.out.println(s1.length());
    }
}
