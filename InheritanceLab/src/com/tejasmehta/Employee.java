/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: On Main
 */
package com.tejasmehta;

public abstract class Employee extends Person{

    private final String jobTitle, company;
    private final int employeeID;
    private final EmployeeType type;

    // Employee constructor to get the type and set the superclass information as well as set instance fields for this class
    public Employee(int employeeID, String jobTitle, String company, String firstname, String lastname, String birthday, EmployeeType type) {
        super(firstname, lastname, birthday);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.company = company;
        this.type = type;
    }

    // Abstract annual salary definition for polymorphism
    public abstract double getAnnualSalary();

    // toString method to print all information
    @Override
    public String toString() {
        return super.toString() + "ID: " + employeeID + '\n' +
                "Title: " + jobTitle + '\n' +
                "Company: " + company + '\n' +
                "Salary: " + getAnnualSalary() + "\n" +
                "Employee Type: " + type;
    }
}
