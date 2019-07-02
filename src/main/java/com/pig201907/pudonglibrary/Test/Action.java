package com.pig201907.pudonglibrary.Test;

public class Action {

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
