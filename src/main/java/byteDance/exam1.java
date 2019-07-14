package byteDance;

import java.util.Scanner;

public class exam1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();

        if(l<1){
            System.out.println("NO");
        }
        else if(r<=l){
            System.out.println("NO");
        }
        else if(r>100000){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            System.out.println(l+" "+r+" ");
        }
    }
}
