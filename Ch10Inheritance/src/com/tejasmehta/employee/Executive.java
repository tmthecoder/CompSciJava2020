/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.employee;

public class Executive extends Manager{
    /**
     * A class to make a generic employee
     *
     * @param name       - The employee's name
     * @param salary     - The Employee's salary
     * @param department - The Employee's department
     */
    public Executive(String name, int salary, String department) {
        super(name, salary, department);
    }

    /**
     * Override toString method to print exec info
     * @return - The string of the executive's info
     */
    @Override
    public String toString() {
        return "Executive[super=" + super.toString() + "]";
    }
}
