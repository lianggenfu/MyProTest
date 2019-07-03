package com.pig201907.pudonglibrary.Test;

public class Action {

    private static final int con = 308;

    public static void main(String[] args) {

        Person person = new Person();
        Man man = new Man();

        person.eat();

        man.eat();

        person.work();

        man.work();
        man.sleep();

        Person.sleep();

    }

}
