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

import com.BankRobber.BankRobber.DAO.BranchDAO;
import com.BankRobber.BankRobber.DAOImplementation.BranchDAOImpl;
import com.BankRobber.BankRobber.Models.Branch;
import com.BankRobber.BankRobber.View.BranchView;

public class BranchViewImpl implements BranchView {

	BranchDAO brnchDAO = new BranchDAOImpl();
	
	public List<Branch>viewBranchTable()
	{
		return brnchDAO.displayBranchTable();
	}
}
