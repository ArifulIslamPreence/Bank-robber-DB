package com.BankRobber.BankRobber.Models;

public class Customer {
	
	private int customer_id;
	private String customer_name;
	private String customer_street;
	private String customer_city;
	
	public Customer(String customer_name)
	{
		
		this.customer_name = customer_name;
		
		
	}
	
	public void setID(int customer_id)
	{
		this.customer_id = customer_id;		
	}
	
	public void setName(String customer_name)
	{
		this.customer_name = customer_name;	
	}
	
	public void setStreet(String customer_street)
	{
		this.customer_street = customer_street;
	}
	
	public void setCity(String customer_city)
	{
		this.customer_city = customer_city;			
	}
	
	public int getID()
	{
		return customer_id;
	}
	
	public String getName()
	{
		return customer_name;
	}
	
	public String getStreet()
	{
		return customer_street;
	}
	
	public String getCity()
	{
		return customer_city;
	}

}
