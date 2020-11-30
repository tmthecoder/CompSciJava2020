/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: On Main
 */
package com.tejasmehta;

public class SalariedEmployee extends Employee{
    private final double salary;

    // Salaries employee constructor to set the pertinent information and set the type
    public SalariedEmployee(int employeeID, String jobTitle, String company, String firstname, String lastname, String birthday, double salary) {
        super(employeeID, jobTitle, company, firstname, lastname, birthday, EmployeeType.SALARIED);
        this.salary = salary;
    }

    // Overload constructor for the type specification specifically for the commision employees
    public SalariedEmployee(int employeeID, String jobTitle, String company, String firstname, String lastname, String birthday, double salary, EmployeeType type) {
        super(employeeID, jobTitle, company, firstname, lastname, birthday, type);
        this.salary = salary;
    }

    // Just return the salary as it is provided to us
    @Override
    public double getAnnualSalary() {
        return salary;
    }

}
