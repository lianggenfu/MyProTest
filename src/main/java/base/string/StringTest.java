package base.string;

public class StringTest {

    public static void main(String[] args) {
        //test1();
        test2();

    }

    private static void test2() {
        String s1 = "helloworld";
        String s2 = new String("helloworld");
        String s3 = "hello";
        String s4 = "world";
        String s5 = "hello"+"world";
        String s6 = s3+s4;
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s6.intern());




    }

    private static void test1() {
        String s = new String("abc");
        System.out.println("tostring: "+s+" hashcode: "+s.hashCode());
        s = s.concat(new String("sdfs"));
        System.out.println("tostring: "+s+" hashcode: "+s.hashCode());

        /*
         * tostring: abc hashcode:687241927
         * tostring: abcsd hashcode:687241927
         *
         * */
    }

}
