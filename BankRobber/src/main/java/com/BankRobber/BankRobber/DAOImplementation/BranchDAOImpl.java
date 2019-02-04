package com.BankRobber.BankRobber.DAOImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.BankRobber.BankRobber.DAO.BranchDAO;
import com.BankRobber.BankRobber.Database.DBOperation;
import com.BankRobber.BankRobber.Models.Branch;


public class BranchDAOImpl implements BranchDAO {
	
	DBOperation dbc = new DBOperation();
	Branch branch;
	
	public List<Branch>displayBranchTable()
	{
		try {
		ResultSet rs = dbc.showBranchTable();
		List<Branch> branchTable = new ArrayList();
		
		if(rs == null)
		{
			return null;
		}
		while(rs.next())
		{
			
			branch = new Branch(rs.getString("branch_name"),rs.getString("branch_city"));//,rs.getLong("asset"));
			branchTable.add(branch);
		}
			return branchTable;
		}catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		return null;
			
		}

}
