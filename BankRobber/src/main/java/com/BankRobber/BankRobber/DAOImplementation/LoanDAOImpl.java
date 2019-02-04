package com.BankRobber.BankRobber.DAOImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.BankRobber.BankRobber.DAO.LoadDAO;
import com.BankRobber.BankRobber.Database.DBOperation;
import com.BankRobber.BankRobber.Models.Branch;
import com.BankRobber.BankRobber.Models.Loan;

public class LoanDAOImpl implements LoadDAO {
	
	DBOperation dbc = new DBOperation();
	Loan loan;
	
	public List<Loan>displayBranchName()
	{
		try {
		ResultSet rs = dbc.showBranchTable();
		List<Loan> loanTable = new ArrayList();
		
		if(rs == null)
		{
			return null;
		}
		while(rs.next())
		{
			
			loan = new Loan(rs.getString("branch_name"));
			loanTable.add(loan);
		}
			return loanTable;
		}catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		return null;
			
		}

}
