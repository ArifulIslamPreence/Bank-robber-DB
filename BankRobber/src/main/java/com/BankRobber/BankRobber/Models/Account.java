package com.BankRobber.BankRobber.Models;

public class Account {

	private int account_number;
	private Branch branch_name;
	private double balance;
	
	public void setAccountNumber(int account_number)
	{
		this.account_number = account_number;
		
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return account_number;
	}
	public double getBalance()
	{
		return balance = balance;
	}
}
