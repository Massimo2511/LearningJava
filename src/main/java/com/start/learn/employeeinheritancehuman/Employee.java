package com.start.learn.employeeinheritancehuman;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Human {

    private LocalDate hireDay;
    private LocalDate salaryDay;
    private String occupation;
    private double salary;
    private double employeeExperience;
    private double promotionPercent;

    public Employee(String Name, String Surname,
                    int yearOfBirth, int monthOfBirth, int dayOfBirth,
                    String occupation,
                    double salary,
                    double employeeExperience,
                    double promotionPercent,
                    int yearOfHireDay, int monthOfHireDay, int dayOfHireDay,
                    int yearOfSalaryDay, int monthOfSalaryDay, int dayOfSalaryDay) {
        super(Name, Surname, yearOfBirth, monthOfBirth, dayOfBirth);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeExperience = employeeExperience;
        this.promotionPercent = promotionPercent;
        hireDay = LocalDate.of(yearOfHireDay, monthOfHireDay, dayOfHireDay);
        salaryDay = LocalDate.of(yearOfSalaryDay, monthOfSalaryDay, dayOfSalaryDay);
    }
    enum Occupation {
        DIRECTOR("DR"),
        HR("HR"),
        WORKER("WR"),
        ENGINEER("EG");
        private Occupation(String abbreviation) {
            this.abbreviation = abbreviation;
        }
        public String getAbbreviation() {
            return abbreviation;
        }
        private String abbreviation;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public LocalDate getSalaryDay() {
        return salaryDay;
    }
    public String getOccupation() {
        return occupation;
    }
    public double getSalary() {
        return salary;
    }
    public double getEmployeeExperience() {
        return employeeExperience;
    }
    public double getPromotionPercent() {
        return promotionPercent;
    }
    public void salaryReview() {
        if (employeeExperience > 1) {
            promotionPercent = 0;
        }
        if (employeeExperience >= 1 && employeeExperience < 2) {
            promotionPercent = 25;
        }
        if (employeeExperience >= 2 && employeeExperience < 3) {
            promotionPercent = 35;
        }
        if (employeeExperience >= 3 && employeeExperience < 4) {
            promotionPercent = 45;
        }
        if (employeeExperience >= 4) {
            promotionPercent = 80;
        }
        double raise = salary * promotionPercent / 100;
        salary += raise;
    }
    public String toString() {
        return getClass().getName() + " [name = " + getName() + ",Surname = " + getSurname() + ",occupation = "+occupation+",salary = " + salary + ", hireDay = "
                + hireDay + ",Employee experience = " +getEmployeeExperience() + " year(s)"+",Promotion Percentage: "+promotionPercent+ "%]"+",Salary Day: "+salaryDay;
    }
    public void defineSalaryDay() {
        long dayRemainsToSalary = 0;
        int todayDayOfMoth=0;
        int generalSalaryDayOfTheMoth=15;
        LocalDate todayDate = LocalDate.now();
        todayDayOfMoth = todayDate.getDayOfMonth();
        LocalDate firstDayOfTheMonth = todayDate.minusDays(todayDayOfMoth - 1);
        LocalDate salaryDate = firstDayOfTheMonth.plusDays(14);
        LocalDate salaryDateInNextMonth = salaryDate.plusDays(31);
        if (todayDayOfMoth == generalSalaryDayOfTheMoth) {
            System.out.println("TODAY is salary day");
        }
        if (salaryDate.getDayOfMonth() > todayDate.getDayOfMonth()&&todayDayOfMoth != generalSalaryDayOfTheMoth) {
            dayRemainsToSalary = ChronoUnit.DAYS.between(todayDate, salaryDate);
        }
        if (salaryDate.getDayOfMonth() < todayDate.getDayOfMonth()&&todayDayOfMoth != generalSalaryDayOfTheMoth){
            dayRemainsToSalary = ChronoUnit.DAYS.between(todayDate, salaryDateInNextMonth);
        }
        System.out.println("First day ot current month is: " + firstDayOfTheMonth);
        System.out.println("TODAY's date is: " + todayDate);
        System.out.println("SALARY date is: " + salaryDate);
        System.out.println("Days to salary: " + dayRemainsToSalary);
        System.out.println("Next salary Date: " + salaryDateInNextMonth);
        salaryDay=salaryDate;
    }
}
