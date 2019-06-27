package base.integer;

public class IntegerTest {

    public static void main(String[] args) {
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        //System.out.println(a==b);
        //false 由于Integer变量实际上是对一个Integer对象的引用，所以两个通过new生成的Integer变量永远是不相等的（因为new生成的是两个对象，其内存地址不同）。

        Integer c = 100;
        Integer d = 100;
        //System.out.println(c==d);
        //true 对于两个非new生成的Integer对象，进行比较时，如果两个变量的值在区间-128到127之间，则比较结果为true，

        Integer e = 200;
        Integer f = 200;
        //System.out.println(e==f);
        //false  对于两个非new生成的Integer对象，进行比较时，，如果两个变量的值不在此区间，则比较结果为false

        System.out.println(a==c);


        Integer g = new Integer(200);
        //System.out.println(e==g);


        Integer i = new Integer(100);
        int j = 100;
        System.out.println(i == j); //true
        //Integer变量和int变量比较时，只要两个变量的值是向等的，则结果为true（因为包装类Integer和基本数据类型int比较时，java会自动拆包装为int，然后进行比较，实际上就变为两个int变量的比较）




    }
}
