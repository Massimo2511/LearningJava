package com.start.learn.human;

import java.time.LocalDate;

public class Human {

    private String nameOfHuman;
    private String surnameOfHuman;
    private final LocalDate dayOfBirth;
    private int humanId = assignId();
    private static int nextHumanId = 1;

    public Human(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.dayOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public Human(String nameOfHuman, String surnameOfHuman, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        //Call to already created constructor
        this(yearOfBirth, monthOfBirth, dayOfBirth);
        this.nameOfHuman = nameOfHuman;
        this.surnameOfHuman = surnameOfHuman;
    }

    private static int assignId() {
        int humanID = nextHumanId;
        nextHumanId++;
        return humanID;
    }

    public int getHumanId() {
        return humanId;
    }

    public String getNameOfHuman() {
        return nameOfHuman;
    }

    public String getSurnameOfHuman() {
        return surnameOfHuman;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setNewName(String newFirstName) {
        this.nameOfHuman = newFirstName;
    }

    public void setNewSurname(String newSurname) {
        this.surnameOfHuman = newSurname;
    }

    @Override
    public String toString() {
        String generalPersonInfo;
        if (this.nameOfHuman != null && this.surnameOfHuman != null) {
            generalPersonInfo = String.format("Human name and surname= %s %s , BirthDay: %tD ", this.getNameOfHuman(), this.getSurnameOfHuman(), this.getDayOfBirth());
        } else {
            generalPersonInfo = String.format("Human ID=%s, BirthDay: %tD ", this.getHumanId(), this.getDayOfBirth());
        }
        return generalPersonInfo;
    }
}