/****
 * Made by Tejas Mehta
 * Made on Monday, November 30, 2020
 * Lab Name: PersonLab
 * Extra: On Main
 */
package com.tejasmehta;

public class Person {
    private String firstName;
    private String lastName;

    // Default constrictor, no name
    Person() {
        this("", "");
    }

    // Constructor that sets the user's name
    Person(String firstName, String lastName) {
        setName(firstName, lastName);
    }

    // Method to set name from any public caller
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to set only the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set only the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to get only the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get only the last name
    public String getLastName() {
        return lastName;
    }

    // Method to print name with last name first
    public void printLastFirst() {
        System.out.println(lastName + ", " + firstName);
    }

    // Method to print name with first name starting
    public void print() {
        System.out.println(firstName + " " + lastName);
    }

    // Method to copy
    public Person getCopy() {
        return copy();
    }

    // Second method to copy
    public Person copy() {
        return new Person(firstName, lastName);
    }

    // toString method to give the name of the person
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    // Equals method to text equality with any other object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }
}
