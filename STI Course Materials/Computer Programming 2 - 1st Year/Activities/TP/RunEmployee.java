
package com.mycompany.runemployee;

import java.util.Scanner;

public class RunEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Press F for Full Time or P for Part Time");
        String employeeName = scanner.nextLine();

        Employee employee;  
        if (employeeName.equalsIgnoreCase("F")) {
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
            System.out.println("Enter monthly salary:");
            double monthlySalary = scanner.nextDouble();
            fullTimeEmployee.setMonthlySalary(monthlySalary);
            employee = fullTimeEmployee;
        } else {
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
            System.out.println("Enter rate per hour and no. of hours worked separated by space:");
            double ratePerHour = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();
            partTimeEmployee.setWage(ratePerHour, hoursWorked);
            employee = partTimeEmployee;
        }

        System.out.println("Name: " + name);
        if (employee instanceof FullTimeEmployee) {
            FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
            System.out.println("Monthly Salary: " + fullTimeEmployee.getMonthlySalary());
        } else {
            PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
            System.out.println("Wage: " + partTimeEmployee.getWage());
        }
    }
}
