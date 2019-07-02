package base.integer;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        String s = "sdfsdfwef";
        String s1 = "  sd fsd  we ";
        //reverse(s);

        byte[] bytes = s.getBytes();
        int[] array = new int[bytes.length];
        for(int i = 0;i<bytes.length;i++){
            array[i] = bytes[i];
        }
        Arrays.sort(array);
        for (int i = 0; i<bytes.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(s.toUpperCase()+" "+s);
        System.out.println(s.trim().length()+" "+s.length());
        System.out.println(s.substring(6));
        char c = s.charAt(4);
        System.out.println(c);
    }

    private static void reverse(String s) {
        /*StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse().toString());*/

        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();
        System.out.println(s1);
    }
}
