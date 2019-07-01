package com.pig201907.pudonglibrary;

import java.util.Objects;

public class HasCodeEquals {

    public static void main(String[] args) {
        String s1 = "通话";
        String s2 = "重地";

        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1.equals(s2));
        // 1179395 1179395  true
    }


    /*public static void main(String[] args) {
        Person person = new Person("通话");
        Person person1 = new Person("通话");;
        System.out.println(person.hashCode()+" "+person1.hashCode());
        System.out.println(person.equals(person1));
    }*/
    static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }


    }

    /*public static void main(String[] args) {
        Person person  = new Person("test");
        Person person1 = new Person("test");
        System.out.println(person.hashCode()+" "+person1.hashCode());
        System.out.println(person.equals(person1));
    }*/
}
