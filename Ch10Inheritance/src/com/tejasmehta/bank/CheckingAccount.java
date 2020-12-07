/****
 * Name: Tejas Mehta
 * Date: Monday, December 7th, 2020
 * Lab Name: Ch10Inheritance
 * Extra: On Main
 */
package com.tejasmehta.bank;

public class CheckingAccount extends BankAccount{
  private final double transactionFee;
  private int transactionCount;


    /**
    * Makes a checking account from the given information
    * @param name customer's name
    * @param balance initial balance
    * @param transactionFee the transaction fee
    */
    public CheckingAccount(String name, double balance, double transactionFee){
        super(name, balance);
        this.transactionFee = transactionFee;
        transactionCount = 0;
    }

    /**
     * Makes a checking account from the given information
     * @param balance initial balance
     * @param transactionFee the transaction fee
     */
    public CheckingAccount(double balance, double transactionFee){
        this("", balance, transactionFee);
    }

    /**
     * Makes a checking account from the given information
     * @param transactionFee the transaction fee
     */
    public CheckingAccount(double transactionFee){
        this("", 0, transactionFee);
    }

    /**
    * Deducts the fees from the built up transactions and resets the count
    */
    public void deductFees() {
        super.withdraw(transactionCount*transactionFee);
        transactionCount = 0;
    }

    /**
    * gets the current number of outstanding transactions
    * @return the current number of outstanding transactions
    */
    public int getTransactionCount() {
    return transactionCount;
    }

    /**
    * Method to check whether this class is an instance of BankAccount
    * @return True if this is an instance of BankAccount
    */
    public boolean isBankAccount() {
    return this instanceof BankAccount;
    }

    /**
    * Overrides the deposit method and adds one to the transactionCount
    * @param amount the amount deposited to the account
    */
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    /**
    * Overrides the withdraw method and adds one to the transactionCount
    * @param amount the amount to withdraw from the account
    */
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    /**
    * toString override method, returns account information
    * @return A String with the account holder's name, balance & transaction fee
    */
    @Override
    public String toString() {
    return super.toString() + "\ntransaction fee: " + transactionFee;
    }
}