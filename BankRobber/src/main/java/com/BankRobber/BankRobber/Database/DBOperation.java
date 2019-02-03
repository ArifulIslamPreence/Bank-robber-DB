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
	CallableStatement cstmt;
	
	public ResultSet findCustomer()
	{
		ResultSet rs;
		try(Statement st = conn.MainConnection().createStatement()) 
		{
	
		cstmt = conn.prepareCall();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
		
}

