/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: On Main
 */
package com.tejasmehta;

public class HourlyEmployee  extends Employee {

    private final double hourlyRate;
    private final double hoursWorked;

    // Hourly Employee constructor to set the pertinent information and the necessary private fields
    public HourlyEmployee(int employeeID, String jobTitle, String company, String firstname, String lastname, String birthday, double hourlyRate, double hoursWorked) {
        super(employeeID, jobTitle, company, firstname, lastname, birthday, EmployeeType.HOURLY);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Return the total made in the year by multiplying the hourly wage by the hours worked.
    @Override
    public double getAnnualSalary() {
        return hoursWorked * hourlyRate;
    }
}
