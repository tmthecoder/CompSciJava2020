/****
 * Name: Tejas Mehta
 * Date: Monday, November 23rd, 2020
 * Name: InheritanceLab
 * Extra: On Main
 */
package com.tejasmehta;

public abstract class Person {
    private final String firstname, lastname, birthday;

    // Person constructor to get their basic information and set it in the fields
    public Person(String firstname, String lastname, String birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    // Return the basic information
    @Override
    public String toString() {
        return "Name: " + firstname + ' ' + lastname + '\n' +
                "Birthday: " + birthday + '\n';
    }
}
