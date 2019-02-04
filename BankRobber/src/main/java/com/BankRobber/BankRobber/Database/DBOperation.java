package com.BankRobber.BankRobber.Database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;

public class DBOperation {

	DBConnection conn = new DBConnection();
	Statement st;
	CallableStatement cstmt=null;
	
	public ResultSet findCustomer()
	{
		ResultSet rs;
		try
		{
	
		cstmt = conn.MainConnection().prepareCall("{call g5SelectCustomer}");
		rs = cstmt.executeQuery();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
	
	public ResultSet showBranchTable()
	{
		ResultSet rs;
		try
		{
	
		cstmt = conn.MainConnection().prepareCall("{call g5DisplayBranch}");
		rs = cstmt.executeQuery();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
	
	public ResultSet showBranchName()
	{
		ResultSet rs;
		try
		{
	
		cstmt = conn.MainConnection().prepareCall("{call g5BranchFromLoan}");
		rs = cstmt.executeQuery();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
		
}

