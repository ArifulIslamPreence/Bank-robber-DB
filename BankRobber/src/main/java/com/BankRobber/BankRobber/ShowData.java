package com.BankRobber.BankRobber;

import java.util.ArrayList;
import java.util.List;

import com.BankRobber.BankRobber.Controller.BankController;
import com.BankRobber.BankRobber.Models.Branch;
import com.BankRobber.BankRobber.Models.Customer;
import com.BankRobber.BankRobber.Models.Loan;

public class ShowData {
	
	 Customer customer;
	 Branch branch;
	 Loan loan;
	 
	 BankController bc = new BankController();
	 
	
	public void ShowName()
	{
		 List<Customer>customerName = new ArrayList();
		 customerName = bc.CustomerNameController();
		 
		 System.out.println("Customer Table:");
		 
		 System.out.println("Customer Names");
		 System.out.println("--------------");
		 
		 for(Customer customer:customerName)
		 {
			 System.out.println(customer.getName());
			 
		 }
		 System.out.println();
		
	}
	
	public void ShowBranchTable()
	{
		List<Branch>branchTable = new ArrayList();
		branchTable = bc.BranchTableShowController();
		
		System.out.println("The Branch Table: \n");
		
		System.out.println("branch_name   branch_city");
		System.out.println("-----------   -----------");
		
		for(Branch branch:branchTable)
		{
			System.out.println(branch.getName()+"     "+branch.getCity());		
			
		}
		System.out.println();
	}
	
	public void ShowBranchNameFromLoan()
	{
		List<Loan>branchNamefrmLoan = new ArrayList();
		branchNamefrmLoan = bc. BranchNameFromLoanController();
		
		System.out.println("The Loan Table: \n");
		
		System.out.println("branch_name");
		System.out.println("-----------");
		
		for(Loan loan:branchNamefrmLoan)
		{
			System.out.println(loan.getBranchName());
			
			
		}
	}
	
	public static void main(String[] args)
	{
		ShowData sd = new ShowData();
		sd.ShowName();
		sd.ShowBranchTable();
		sd.ShowBranchNameFromLoan();
		
	}
}
