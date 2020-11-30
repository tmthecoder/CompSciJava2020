/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: On Main
 */
package com.tejasmehta;

public class CommissionEmployee extends SalariedEmployee {

    private final double totalSales;
    private final double comissionPercentage;

    // Commission Employee constructor to set the pertinent info in superclasses as well as the private fields
    public CommissionEmployee(int employeeID, String jobTitle, String company, String firstname, String lastname, String birthday, double totalSales, double comissionPercentage) {
        super(employeeID, jobTitle, company, firstname, lastname, birthday, totalSales * (comissionPercentage/100.0), EmployeeType.COMMISSIONED);
        this.comissionPercentage = comissionPercentage/100.0;
        this.totalSales = totalSales;
    }

    // Get the annual salary by multiplying total sales and the percentage of comission
    @Override
    public double getAnnualSalary() {
        return totalSales*comissionPercentage;
    }
}
