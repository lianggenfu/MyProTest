package com.pig20190329.home;

//动物类
public class Animals {

    //名称
    private String name;

    //性别
    private String sex;

    public Animals(String name,String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("the base skill ：eat");
    }

    public void sleep(){
        System.out.println("the base skill ：sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
