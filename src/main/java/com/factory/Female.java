package com.factory;

public class Female implements People{
    String name;
    int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void speak() {
        System.out.println("female speak");
    }
}
