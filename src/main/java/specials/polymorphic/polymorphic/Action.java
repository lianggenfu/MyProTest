package specials.polymorphic.polymorphic;

public class Action {

    public static void main(String[] args) {
        Animals animals = new Animals() {
            @Override
            public void eat() {

            }
        };

        animals.test();
        //  I am Animals

        animals.test(3);
        //  this is the overload methoad of function : test

        show(new Cat());
        //I like fish
        //I can catch mouse

        show(new Dog());
        //I like bones
        //I can watch house

        animals.eat();
        //Animals只有抽象方法eat，所以没有输出

        Animals animals1 = new Cat();
        animals1.eat();
        //I like fish

        ((Cat)animals1).work();
        //I can catch mouse
    }

    public static void show(Animals a){
        a.eat();
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.work();
        }else if(a instanceof Dog){
            Dog d = (Dog) a;
            d.work();
        }
    }
}
