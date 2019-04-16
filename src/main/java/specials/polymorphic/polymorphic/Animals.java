package specials.polymorphic.polymorphic;


//抽象父类：Animals
public abstract class Animals {

    public abstract void eat();

    public void test(){
        System.out.println("I am Animals");
    }

    public void test(int num){    //获取方法名  jdk1.4
        System.out.println("this is the overload methoad of function : "+ new Exception().getStackTrace()[0].getMethodName());
    }
    public void test(String s){   //获取方法名  jdk1.5以后
        System.out.println("this is the overload methoad of function : "+ Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
