package com.pig20190329.home;

public class Dog extends Animals{

    //品种
    private String specials;

    public Dog(String name, String sex) {
        super(name, sex);
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "specials='" + specials + '\'' +
                '}';
    }
}
