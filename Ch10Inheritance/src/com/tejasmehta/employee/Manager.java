/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.employee;

public class Manager extends Employee{

    private final String department;

    /**
     * A class to make a generic employee
     *
     * @param name   - The employee's name
     * @param salary - The Employee's salary
     * @param department - The Employee's department
     */
    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager[super=" + super.toString() + ", department=" + department + ']';
    }
}
