/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.employee;

public class Employee {

    private final String name;
    private final int salary;

    /**
     * A class to make a generic employee
     * @param name - The employee's name
     * @param salary - The Employee's salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * toString method for the Employee class
     * @return - The string with the employee's info
     */
    @Override
    public String toString() {
        return "Employee[" + "name=" + name + ",salary=" + salary + ']';
    }
}
