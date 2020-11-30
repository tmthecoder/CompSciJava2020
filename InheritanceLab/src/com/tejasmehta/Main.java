/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: Added an employee type enum to print their earnings type
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //Make classes and print all information
        System.out.println("Employee Information");
        System.out.println("------------------------------------------------");
        System.out.println(new SalariedEmployee(1, "CEO", "Microsoft", "Bill", "Gates", "October 28, 1955", 1500000000));
        System.out.println("------------------------------------------------");
        System.out.println(new SalariedEmployee(2, "Co-Founder", "Microsoft", "Paul", "Allen", "January 21, 1953", 100000000));
        System.out.println("------------------------------------------------");
        System.out.println(new CommissionEmployee(3, "Salesman", "Company", "Sammy", "Salesman", "January 1, 1970", 4000000, 10));
        System.out.println("------------------------------------------------");
        System.out.println(new HourlyEmployee(4, "Hourly Worker", "Hours R Us", "Harriet", "Hourly", "December 31, 1971", 20, 2080));
    }
}
