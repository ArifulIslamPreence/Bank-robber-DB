package com.BankRobber.BankRobber.Models;

public class Loan {
	
	private int loan_number;
	private String branch_name;
	private double amount;
	private Customer customer_id;
	
	public Loan(String branch_name)
	{
		this.branch_name = branch_name;
	}
	
	public void setBranchName(String branch_name)
	{
		this.branch_name = branch_name;
	}
	
	public String getBranchName()
	{
		return branch_name;
	}

}
