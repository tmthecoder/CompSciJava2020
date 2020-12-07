/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.bank;

public class TimeDepositAccount extends SavingsAccount {

    private final double FEE = 20;
    int matureMonths;

    /**
     * Constructs a TimeDepositAccount from the given info
     * @param name - Holder's name
     * @param balance - Holder's initial account balance
     * @param months - Months to mature
     * @param rate - Rate of interest
     */
    public TimeDepositAccount(String name, double balance, double rate, int months) {
        super(name, balance, rate);
        matureMonths = months;
    }

    /**
     * Constructs a TimeDepositAccount from the given info
     * @param balance - Holder's initial account balance
     * @param months - Months to mature
     * @param rate - Rate of interest
     */
    public TimeDepositAccount(double balance, double rate, int months) {
        this("", balance, rate, months);
    }

    /**
     * Constructs a TimeDepositAccount from the given info
     * @param months - Months to mature
     * @param rate - Rate of interest
     */
    public TimeDepositAccount(double rate, int months) {
        this("", 0, rate, months);
    }

    /**
     * Override the addInterest method to work with the maturing months
     */
    @Override
    public void addInterest() {
        super.addInterest();
        matureMonths--;
    }

    /**
     * Override the withdraw method to add the fee checking
     * @param amount - amount to withdraw
     */
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (matureMonths > 0) {
            setBalance(getBalance()-FEE);
        }
    }
}
