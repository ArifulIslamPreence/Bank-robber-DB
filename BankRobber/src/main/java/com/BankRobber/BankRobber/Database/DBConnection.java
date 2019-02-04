package com.BankRobber.BankRobber.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;	

public class DBConnection {
	
	private static Connection conn;
	
	
	public Connection MainConnection()
	{
		try
		{
			conn =  DriverManager.getConnection("jdbc:sqlserver://vNTDACLSCRAPR01:1433;databaseName=BankAccountMNG;"
					+ "user = bankaccountmng_dbo;password =bankaccountmng_dbo123");
			
			if(conn != null )
			{
				System.out.println("Connected");
			}
			else
			{
				System.out.println("Not connected");
			}
			return conn;
			
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
		return conn;
		
	}
	

}
