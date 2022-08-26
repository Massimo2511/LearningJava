package com.start.learn.practicewithinterfacesandabstractclass;

public abstract class Creature {
    protected String creatureName;
    protected double creatureWeight;
    protected double creatureHeight;

    public Creature(String creatureName, double creatureWeight, double creatureHeight) {
        this.creatureName = creatureName;
        this.creatureWeight = creatureWeight;
        this.creatureHeight = creatureHeight;
    }

    public abstract void creatureRun();

    public void creatureFly() {
        System.out.println(this.creatureName + " can fly");
    }

    public String toString() {
        return "Creature name: " + creatureName + " Creature weight: " + creatureWeight + " Creature height: " + creatureHeight;
    }
}
