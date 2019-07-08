package com.pig201907.pudonglibrary.ListTest;

import java.util.*;

public class Student implements Comparable<Student> {

    private int age;
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return (this.age < student.age) ? -1 : ((this.age == student.age) ? 0 : 1);
        //return 0;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5));
        students.add(new Student(3));
        students.add(new Student(7));
        students.add(new Student(2));
        students.add(new Student(4));
        students.add(new Student(6));
        students.add(new Student(1));
        Collections.sort(students);
        for (Student student : students){
            System.out.print(student.getAge()+" ");
        }
        System.out.println();
    }

}
