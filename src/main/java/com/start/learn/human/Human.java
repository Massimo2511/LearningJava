package com.start.learn.human;

import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private final LocalDate dayOfBirth;
    private int humanId = assignId();
    private static int nextHumanId = 1;

    private static int assignId() {
        int humanID = nextHumanId;
        nextHumanId++;
        return humanID;
    }

    public static int getNextHumanId() {
        return nextHumanId;
    }

    public Human(int year, int month, int day) {

        dayOfBirth = LocalDate.of(year, month, day);

    }

    public Human(String eName, String eSurname, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        name = eName;
        surname = eSurname;
        this.dayOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
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

    public void setNewNameAndSurname(Human person) {
        this.name = "Mister";
        this.surname = "White";
    }

    public static void printHumanInfo(Human person) {
        String generalPersonInfo;
        if (person.name != null && person.surname != null) {
            generalPersonInfo = String.format("Human name and surname= %s %s , BirthDay: %tD ", person.getName(), person.getSurname(), person.getDayOfBirth());
        } else {
            generalPersonInfo = String.format("Human ID=%s, BirthDay: %tD ", getNextHumanId(), person.getDayOfBirth());
        }
        System.out.println(generalPersonInfo);
    }
}