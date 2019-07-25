package base.string;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println("tostring: "+sb.toString()+" hashcode:"+sb.hashCode());
        sb = sb.append(new StringBuffer("sd"));

        System.out.println("tostring: "+sb.toString()+" hashcode:"+sb.hashCode());
    }
}
