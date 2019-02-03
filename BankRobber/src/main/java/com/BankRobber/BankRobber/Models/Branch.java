package com.BankRobber.BankRobber.Models;

public class Branch {
	
	private int Id;
	private String branch_name;
	private String branch_city;
	private double asset;
	
	public void setId(int Id)
	{
		this.Id = Id;	
	}
	public void setName(String branch_name)
	{
		this.branch_name = branch_name;
	}
	
	public void setCity(String branch_city)
	{
		this.branch_city = branch_city;
	}
	
	public void setAsset(double asset)
	{
		this.asset = asset;
	}
	
	public int getId()
	{
		return Id;
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
