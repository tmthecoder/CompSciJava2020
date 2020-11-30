/****
 * Made by Tejas Mehta
 * Made on Monday, November 30, 2020
 * Lab Name: PersonLab
 * Extra: Added the option to add hours or modify the payrate on its own, as well as modify each value individually
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        // Default constructor
        System.out.println("With Default Constructor: ");
        Person p = new Person();
        p.setName("Tejas", "Mehta");
        p.print();
        p.printLastFirst();
        p.setFirstName("Not Tejas");
        p.setLastName("Not Mehta");
        System.out.println(p);

        // Named Constructor
        System.out.println("\nWith Named Constructor: ");
        Person p2 = new Person("Tejas", "Mehta");
        p2.print();
        p2.printLastFirst();
        p2.setFirstName("Not Tejas");
        p2.setLastName("Not Mehta");
        System.out.println(p);
        System.out.println("P2 = P1? " + p2.equals(p));

        // Default constructor
        Employee e = new Employee();
        System.out.println("\nWith Default Constructor: ");
        e.setAll("Tejas", "Mehta", 15, 45, "Software");
        e.print();
        System.out.println(e);
        e.addHours(10);
        System.out.println("\nAfter adding 10 hours:");
        e.print();
        System.out.println(e);
        System.out.println("\nAfter subtracting 10 hours");
        e.subtractHours(10);
        e.print();
        System.out.println(e);

        // Named constructor
        Employee e2 = new Employee("Tejas", "Mehta", 16, 45, "Software");
        System.out.println("\nWith Named Constructor: ");
        e2.print();
        System.out.println(e2);
        System.out.println("E2 = E1? " + e2.equals(e));
        System.out.println("After manually changing department and payrate: ");
        e2.setDepartment("Applications");
        e2.setPayRate(20);
        e2.print();
        System.out.println(e2);
    }
}
