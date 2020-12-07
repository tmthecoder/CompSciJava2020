/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.bank;

/** 
 * 
 * Implements a bank account storing balance and 
 * 	customer's name
 * 
 * @author  S. Andrianoff
 * @version July 21, 2014
 *
 */

public class BankAccount {
	private double balance;
	private String name;
	
	/**
	 * Constructs a BankAccount from a name and a balance
	 * @param n customer's name
	 * @param b starting balance
	 */
	public BankAccount(String n, double b){
		balance = b;
		name = n;
	}
	   	
	/**
	 * Constructs a BankAccount from a name.
	 * Initial balance is 0.
	 * @param n customer's name
	 */
	public BankAccount(String n){
		this(n, 0.0);
	}
	
	/**
	 * Returns the name of the owner of the account
	 * @return name of owner
	 */
 	public String getName(){
		return name;	
 	}

	/**
	 * Returns the current balance in the account
	 * @return current balance
	 */
 	public double getBalance(){
		return balance;	
 	}

	/**
	 * Deposits an amount into the account
	 * @param amount amount deposited
	 * @throws IllegalArgumentException if amount is negative
	 */
	public void deposit(double amount){
		if (amount < 0.0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			balance += amount;
		}
	}
	
	/**
	 * Withdraws an amount from the account
	 * @param amount amount withdraw
	 */
	public void withdraw(double amount){
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
		if (amount > balance)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			balance -= amount;
		}
	}

	/**
	 * A method to transfer between accounts
	 * @param amount - The amount to transfer
	 * @param o - The account to transfer to
	 */
	public void transfer(double amount, BankAccount o) {
		o.deposit(amount);
		withdraw(amount);
	}

	/**
	 * Sets a new balance
	 * @param balance - New balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	* isSavings method, checks whether the accoount is a savings account
	* @return A boolean based on whether the account is an instance of SavingsAccount
	*/
	public boolean isSavings() {
	return this instanceof SavingsAccount;
	}

	/**
	* toString override method, returns account information
	* @return A String with the account holder's name & balance
	*/
	@Override
	public String toString() {
	return "name: " + name + "\nbalance: " + balance;
	}

}
 