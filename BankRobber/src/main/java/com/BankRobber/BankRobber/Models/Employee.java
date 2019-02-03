package com.BankRobber.BankRobber.Models;

public class Employee {

	private int id;
	private String employee_name;
	private Branch branch_name;
	private double salary;
	private String BranchName = branch_name.getName();
	
	public Employee(int id,String employee_name,String BranchName,double salary)
	{
		this.id = id;
		this.employee_name = employee_name;
		this.BranchName = BranchName;
		this.salary = salary;
		
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setBranchName(String BranchName)
	{
		this.BranchName = BranchName;
	}
	
	public void setName(String employee_name)
	{
		this.employee_name = employee_name;
	}
	
	public void setSalary(double salary)
	{
		this.salary =salary;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getBranchName()
	{
		return BranchName;
	}
	
	public String getName()
	{
		return employee_name;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
