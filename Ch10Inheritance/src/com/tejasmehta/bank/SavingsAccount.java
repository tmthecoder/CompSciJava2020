/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.bank;

public class SavingsAccount extends BankAccount {
	private final double interestRate;
	private double minimumBalance;
	/**
	 * Constructs a savings account from 
	 * 	a customer name, an initial balance, and an
	 * 	interest rate.
	 * @param name customer's name
	 * @param balance initial balance
	 * @param rate interest rate	
	 */
	public SavingsAccount(String name, double balance, double rate){
		super(name, balance);
		interestRate = rate;
		minimumBalance = balance;
	}

	/**
	 * Constructs a savings account from
	 *  an initial balance and an
	 * 	interest rate.
	 * @param balance initial balance
	 * @param rate interest rate
	 */
	public SavingsAccount(double balance, double rate) {
		this("", balance, rate);
	}

	/**
	 * Constructs a savings account from
	 *  an interest rate.
	 * @param rate interest rate
	 */
	public SavingsAccount(double rate) {
		this("", 0, rate);
	}

	/**
	 * Adds interest to the balance using the interest rate and the minumum.
	 */
	public void addInterestMin(){
		this.deposit((interestRate/100.0)*minimumBalance);
		minimumBalance = getBalance();
	}

	/**
	 * Adds interest to the balance using the interest rate.
	 */
	public void addInterest(){
		this.deposit((interestRate/100.0)*getBalance());
	}

	/**
	 * Overridden withdraw method to change minumum balance
	 * @param amount amount withdraw
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		minimumBalance = minimumBalance > amount ? minimumBalance - amount : 0;
	}

	/**
	* isSavings method, checks whether the accoount is a bank account
	* @return A boolean based on whether the account is an instance of BankAccount
	*/
	public boolean isBankAccount() {
	return this instanceof BankAccount;
	}

	/**
	* toString override method, returns account information
	* @return A String with the account holder's name, balance & interest rate
	*/
	@Override
	public String toString() {
	return super.toString() + "\nrate: " + interestRate;
	}

}
