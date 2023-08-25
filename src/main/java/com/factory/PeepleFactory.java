package com.factory;

public class PeepleFactory {

    public People getPeople(int num){
        if(num == 0){
            return new Male();
        }else {
            return new Female();
        }
    }

    public static void main(String[] args) {
        PeepleFactory peepleFactory = new PeepleFactory();
        People people = peepleFactory.getPeople(1);
        people.speak();
    }
}
