package com.joeknowles.zookeeper;

public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("I just threw something!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("I just ate bananas!");
        energyLevel += 10;
    }

    public void climbSomething() {
        System.out.println("I just climbed something!");
        energyLevel -= 10;
    }
}
