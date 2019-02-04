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

import com.BankRobber.BankRobber.DAO.CustomerDAO;
import com.BankRobber.BankRobber.DAOImplementation.customerDAOImpl;
import com.BankRobber.BankRobber.Models.Customer;
import com.BankRobber.BankRobber.View.CustomerView;

public class CustomerViewImpl implements CustomerView {
	
	CustomerDAO cusDAO = new customerDAOImpl();
	
	
	public List<Customer> viewCustomerName() {
		// TODO Auto-generated method stub
		return cusDAO.FindCustomerName();
	}

}
