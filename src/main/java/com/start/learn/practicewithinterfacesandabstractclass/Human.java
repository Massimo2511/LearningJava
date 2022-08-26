package com.start.learn.practicewithinterfacesandabstractclass;

import java.time.LocalDate;

public class Human extends Creature implements Organism, Comparable<Human> {

    private final LocalDate dateOfBirth;

    public Human(String creatureName, double creatureWeight, double creatureHeight, int yearOfBirth, int monthOfBirth, int dateOfBirth) {
        super(creatureName, creatureWeight, creatureHeight);
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dateOfBirth);
    }

    @Override
    public void creatureRun() {
        System.out.println(this.creatureName + " can run");
    }

    @Override
    public void speak() {
        System.out.println(this.creatureName + " can speak");
    }

    @Override
    public int compareTo(Human object) {
        return Double.compare(super.creatureWeight, object.creatureWeight);
    }

    @Override
    public String toString() {
        return super.toString() + " Date of Birth:" + dateOfBirth;
    }
}
