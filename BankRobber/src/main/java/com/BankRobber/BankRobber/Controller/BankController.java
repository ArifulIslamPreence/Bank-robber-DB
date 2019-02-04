package com.BankRobber.BankRobber.Controller;

import java.util.List;

import com.BankRobber.BankRobber.Models.Branch;
import com.BankRobber.BankRobber.Models.Customer;
import com.BankRobber.BankRobber.Models.Loan;
import com.BankRobber.BankRobber.Services.BranchViewImpl;
import com.BankRobber.BankRobber.Services.CustomerViewImpl;
import com.BankRobber.BankRobber.Services.LoanViewImpl;
import com.BankRobber.BankRobber.View.BranchView;
import com.BankRobber.BankRobber.View.CustomerView;
import com.BankRobber.BankRobber.View.LoanView;

public class BankController {
	
	Customer customer;
	Branch branch;
	Loan loan;
	
	CustomerView csvw = new CustomerViewImpl();
	BranchView brnchvw = new BranchViewImpl();
	LoanView loanvw = new LoanViewImpl();
	


	public List<Customer> CustomerNameController() {
		// TODO Auto-generated method stub
		return csvw.viewCustomerName();
	}
	
	public List<Branch> BranchTableShowController()
	{
		return brnchvw.viewBranchTable();
	}
	
	public List<Loan> BranchNameFromLoanController()
	{
		return loanvw.viewBranchFromLoan();
	}
	
	

}
