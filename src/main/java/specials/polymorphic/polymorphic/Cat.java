package specials.polymorphic.polymorphic;

public class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("I like fish");
    }

    //添加自己的方法
    public void work() {
        System.out.println("I can catch mouse");
    }
}
