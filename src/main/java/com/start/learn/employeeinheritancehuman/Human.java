package com.start.learn.employeeinheritancehuman;

import java.time.LocalDate;

public class Human {

    protected String name;
    protected String surname;
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

    public String toString() {
        String generalPersonInfo;
        if (this.name != null && this.surname != null) {
            generalPersonInfo = String.format("Human name and surname= %s %s , BirthDay: %tD ,Object status: %S", this.name, this.surname, this.dayOfBirth, this.getStatus());
        } else {
            generalPersonInfo = String.format("Human ID=%s, BirthDay: %tD ,Object status: %S", this.humanId, this.dayOfBirth, this.getStatus());
        }
        return generalPersonInfo;
    }

    public String getStatus() {
        if (this instanceof Human)
            return "Do nothing for now";
        return "Object is not Human";
    }
}
