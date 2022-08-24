package com.start.learn.employeeinheritancehuman;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Employee extends Human {

    private LocalDate hireDate;
    private LocalDate salaryDate;
    private Occupation occupation;
    private double salary;
    private int employeeExperience;
    private double promotionPercent;

    public Employee(String name,
                    String surname,
                    int yearOfBirth,
                    int monthOfBirth,
                    int dayOfBirth,
                    Occupation occupation,
                    double salary,
                    int yearOfHireDay,
                    int monthOfHireDay,
                    int dayOfHireDay) {
        super(name, surname, yearOfBirth, monthOfBirth, dayOfBirth);
        this.salary = salary;
        hireDate = LocalDate.of(yearOfHireDay, monthOfHireDay, dayOfHireDay);
        salaryDate = LocalDate.now().withDayOfMonth(15);
        this.occupation = occupation;
        employeeExperience = 0;
        promotionPercent = 0;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
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
        employeeExperience = getCalculatedEmployeeExperience();
        if (employeeExperience < 1) {
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

    @Override
    public String toString() {
        return "\nEmployee Name = " + this.name + ", Employee Surname = " + this.surname +
                "\nOccupation = " + occupation + ",Salary = " + salary + "\nHire Day := " + hireDate + ", " +
                "\nEmployee_experience = " + employeeExperience + " year(s)" + ",Promotion Percentage: " + promotionPercent + "%" +
                "\nUpcoming Salary Date: " + salaryDate+ "\nObject status:"+getStatus();
    }

    //Calculate amount of Days until salary day
    public long getDaysUntilSalaryInCurrentMonth() {
        long daysUntilSalary = 0;
        LocalDate todayDate = LocalDate.now();
        LocalDate salaryDateInNextMonth = salaryDate.plusMonths(1);
        if (todayDate.getDayOfMonth() == salaryDate.getDayOfMonth()) {
            System.out.println("TODAY is salary day");
        } else if (salaryDate.getDayOfMonth() > todayDate.getDayOfMonth()) {
            daysUntilSalary = ChronoUnit.DAYS.between(todayDate, salaryDate);
        } else {
            daysUntilSalary = ChronoUnit.DAYS.between(todayDate, salaryDateInNextMonth);
            salaryDate = salaryDateInNextMonth;
        }
        return daysUntilSalary;
    }

    public int getCalculatedEmployeeExperience() {
        Period employeeExperienceTime = Period.between(hireDate, LocalDate.now());
        return employeeExperienceTime.getYears();
    }

    @Override
    public String getStatus() {
        // super.getStatus();
        if (this instanceof Employee)
            return "I am working on the project";
        return "Object is not employee";
    }
}
