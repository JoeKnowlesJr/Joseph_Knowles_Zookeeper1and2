package com.joeknowles.zookeeper;

public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("<sound of flying>");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("<burrrrrrp>");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("<sound of attacking>");
        energyLevel -= 100;
    }
}
