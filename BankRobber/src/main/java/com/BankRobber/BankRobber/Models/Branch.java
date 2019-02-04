package com.BankRobber.BankRobber.Models;

public class Branch {
	
	
	private String branch_name;
	private String branch_city;
	private long asset;
	
	public Branch(String branch_name,String branch_city)
	{
		this.branch_name = branch_name;
		this.branch_city = branch_city;
		this.asset = asset;
		
		
	}
	
	
	public void setName(String branch_name)
	{
		this.branch_name = branch_name;
	}
	
	public void setCity(String branch_city)
	{
		this.branch_city = branch_city;
	}
	
	public void setAsset(long asset)
	{
		this.asset = asset;
	}
	
	
	public String getName()
	{
		return branch_name;
	}
	
	public String getCity()
	{
		return branch_city;
	}
	
	public double getAsset()
	{
		return asset;
	}

}
