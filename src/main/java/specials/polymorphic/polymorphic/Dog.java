package specials.polymorphic.polymorphic;

public class Dog extends Animals{
    @Override
    public void eat() {
        System.out.println("I like bones");
    }

    public void work(){
        System.out.println("I can watch house");
    }
}
