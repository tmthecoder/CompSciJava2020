/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: For P10.1 and P10.2, I added alternate constructors to all classes and a name field, and for P10.5, I added a CEO Class
 */
package com.tejasmehta;

import com.tejasmehta.bank.CheckingAccount;
import com.tejasmehta.bank.SavingsAccount;
import com.tejasmehta.bank.TimeDepositAccount;
import com.tejasmehta.employee.CEO;
import com.tejasmehta.employee.Employee;
import com.tejasmehta.employee.Executive;
import com.tejasmehta.employee.Manager;

public class Main {

    public static void main(String[] args) {
        //Lab P10.1 tester
        System.out.println("P10.1");
        SavingsAccount testSavings = new SavingsAccount(5);
        testSavings.deposit(10000);
        testSavings.addInterestMin();
        testSavings.withdraw(5000);
        testSavings.withdraw(3000);
        testSavings.deposit(10000);
        testSavings.addInterestMin(); // interest computed on $2000
        System.out.println("Balance: " +
                testSavings.getBalance());
        System.out.println("Expected: 12100");

        //LabP10.2 Tester
        System.out.println("\nP10.2");
        SavingsAccount momsSavings = new SavingsAccount(5);
        CheckingAccount harrysChecking = new
                CheckingAccount(4.0/5);
        TimeDepositAccount collegeFund = new
                TimeDepositAccount(10, 3);
        momsSavings.deposit(10000);
        momsSavings.transfer(2000, harrysChecking);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(80);
        momsSavings.transfer(1100, harrysChecking);
        harrysChecking.withdraw(400);
        momsSavings.transfer(3000, collegeFund);
        collegeFund.withdraw(800);
        momsSavings.addInterest();
        collegeFund.addInterest();
        harrysChecking.deductFees();
        System.out.println("Mom's savings balance: "
        + momsSavings.getBalance());
        System.out.println("Expected: 4200");
        System.out.println("Harry's checking balance: "
        + harrysChecking.getBalance());
        System.out.println("Expected: 1116");
        System.out.println("College fund's time deposit balance: "
        + collegeFund.getBalance());
        System.out.println("Expected: 2398");

        //LabP10.5
        System.out.println("\nP10.5");
        Employee e = new Employee("Edgar", 65000);
        Manager m = new Manager("Mary", 85000,"Engineering");
        Executive v = new Executive("Veronica", 105000, "Engineering");
        CEO c = new CEO("Veronica", 105000, "Executive");
        System.out.println(e);
        System.out.println("Expected:Employee[name=Edgar,salary=65000.0]");
        System.out.println(m);
        System.out.println("Expected: Manager[super=Employee[name=Mary,salary=85000.0],department=Engineering]");
        System.out.println(v);
        System.out.println("Expected: Executive[super=Manager[super=Employee[name=Veronica,salary=105000.0], department=Engineering]]");
        System.out.println(c);
        System.out.println("Expected: CEO[super=Executive[super=Manager[super=Employee[name=Veronica,salary=105000.0], department=Engineering]]]");
    }
}
