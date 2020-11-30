/****
 * Made by Tejas Mehta
 * Made on Monday, November 30, 2020
 * Lab Name: PersonLab
 * Extra: On Main
 */
package com.tejasmehta;

public class Employee extends Person{
    private double payRate;
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    // Empty constructor
    public Employee() {
        this("", "", 0.0, 0.0, "");
    }

    // Constructor with parameters to set all values
    public Employee(String firstName, String lastName, double payrate, double hoursWorked, String department) {
        super(firstName, lastName);
        setAll(firstName, lastName, payrate, hoursWorked, department);
    }

    // Method to set all values from any calling class
    public void setAll(String firstName, String lastName, double payRate, double hoursWorked, String department) {
        super.setName(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }

    // Method to set only the payRate
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // Method to set only the hoursWorked
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Method to set only the department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to add hours
    public void addHours(double hours) {
        hoursWorked += hours;
    }

    // Method to subtract hours
    public void subtractHours(double hours) {
        hoursWorked -= hours;
    }

    // Getter for the payRate
    public double getPayRate() {
        return payRate;
    }

    // Getter for the hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Getter for the department itself
    public String getDepartment() {
        return department;
    }

    // Method to print the employee's name, department, and hours worked
    public void print() {
        System.out.println("The employee " + super.toString() + " from the " + department + " department worked " + hoursWorked + " hours");
    }

    // Method to calculate the user's payment with overtime
    public double calculatePay() {
        double normalHours = hoursWorked;
        double overtimeHours = 0;
        if (hoursWorked - HOURS > 0) {
            normalHours = HOURS;
            overtimeHours = hoursWorked - HOURS;
        }
        return (normalHours * payRate) + (overtimeHours * payRate * OVERTIME);
    }

    // Another term for the copy method
    public Employee getCopy() {
        return copy();
    }

    // Copy method to copy the employee into another object
    public Employee copy() {
        return new Employee(getFirstName(), getLastName(), payRate, hoursWorked, department);
    }

    // toString method to return wage, department, and payment
    @Override
    public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
    }

    // Equals method to test equality with any other obejct
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.payRate, payRate) == 0 &&
                Double.compare(employee.hoursWorked, hoursWorked) == 0 &&
                department.equals(employee.department);
    }
}
