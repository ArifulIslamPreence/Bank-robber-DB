package com.BankRobber.BankRobber.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.BankRobber.BankRobber.DAO.LoadDAO;
import com.BankRobber.BankRobber.DAOImplementation.LoanDAOImpl;
import com.BankRobber.BankRobber.Models.Loan;
import com.BankRobber.BankRobber.View.LoanView;

public class LoanViewImpl implements LoanView {
	
 LoadDAO brnchDAO = new LoanDAOImpl();
	
	public List<Loan>viewBranchFromLoan()
	{
		return brnchDAO.displayBranchName();
	}

}
