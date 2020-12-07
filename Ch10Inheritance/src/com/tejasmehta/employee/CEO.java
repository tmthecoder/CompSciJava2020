/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.employee;

public class CEO extends Executive{
    /**
     * A class to make a generic employee
     *
     * @param name       - The employee's name
     * @param salary     - The Employee's salary
     * @param department - The Employee's department
     */
    public CEO(String name, int salary, String department) {
        super(name, salary, department);
    }

    /**
     * A method to print the CEO's info toString
     * @return - A string with the CEO's info
     */
    @Override
    public String toString() {
        return "CEO[super=" + super.toString() + "]";
    }
}
