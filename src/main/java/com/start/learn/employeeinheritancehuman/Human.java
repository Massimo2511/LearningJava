package com.start.learn.employeeinheritancehuman;

import java.time.LocalDate;

public class Human {

    private String name;
    private String surname;
    private final LocalDate dayOfBirth;
    private int humanId = assignId();
    private static int nextHumanId = 1;

    public Human(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.dayOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public Human(String Name, String Surname, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this(yearOfBirth, monthOfBirth, dayOfBirth);
        this.name = Name;
        this.surname = Surname;
    }

    private static int assignId() {
        int humanID = nextHumanId;
        nextHumanId++;
        return humanID;
    }

    public int getHumanId() {
        return humanId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setNewName(String newFirstName) {
        this.name = newFirstName;
    }

    public void setNewSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String toString(Human person) {
        String generalPersonInfo;
        if (person.name != null && person.surname != null) {
            generalPersonInfo = String.format("Human name and surname= %s %s , BirthDay: %tD ", person.getName(), person.getSurname(), person.getDayOfBirth());
        } else {
            generalPersonInfo = String.format("Human ID=%s, BirthDay: %tD ", person.getHumanId(), person.getDayOfBirth());
        }
        return generalPersonInfo;
    }

    public void getStatus() {
        if (this instanceof Human) {
            String status = "Do nothing for now";
            boolean isHuman = this instanceof Human;
            System.out.println("isHuman: " + isHuman);
            System.out.println(status);
        }
    }
}
