package com.mycompany.runemployee;

public class PartTimeEmployee extends Employee {
   
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = ratePerHour * hoursWorked;
    }

    public double getWage() {
        return wage;
    }
}