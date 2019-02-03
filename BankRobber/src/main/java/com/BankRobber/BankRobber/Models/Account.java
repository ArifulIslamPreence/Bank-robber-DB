package com.BankRobber.BankRobber.Models;

public class Account {

	private int acount_number;
	private Branch branch_name;
	private double balance;
	
	public void setAcoountNumber(int account_number)
	{
		this.acount_number = account_number;
		
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}
