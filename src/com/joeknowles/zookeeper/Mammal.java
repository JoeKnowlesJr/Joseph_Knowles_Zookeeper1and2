package com.joeknowles.zookeeper;

public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergyLevel() {
        System.out.println(String.format("Energy level: %d", energyLevel));
        return energyLevel;
    }

    @Override
    public String toString() {
        return String.format("%s - EnergyLevel: %d", this.getClass().getSimpleName(), energyLevel);
    }
}
