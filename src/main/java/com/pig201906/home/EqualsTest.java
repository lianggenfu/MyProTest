package com.pig201906.home;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = "java";
        String s4 = "java";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s3==s4);

        // true
        // false
        // true
        /* s1.equals s2 为true是因为equals比较的String值
        *  s1==s2 为false 是因为new String()开辟了新的内存空间
        *  s3==s4 为true是因为s4未重新new “java” 字符串，而是直接将内存中s3开辟的“java“地址赋给了s4
        * */


        Person person1 = new Person("hello");
        Person person2 = new Person("hello");
        //System.out.println(person1.name.equals(person2.name));
        System.out.println(person1.equals(person2));


        String str1 = "通话";
        String str2 = "重地";
        //System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
        System.out.println(str1.hashCode()+" "+str2.hashCode());
        System.out.println(str1.equals(str2));

    }

    public static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
