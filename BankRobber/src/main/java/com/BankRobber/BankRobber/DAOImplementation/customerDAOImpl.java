package com.BankRobber.BankRobber.DAOImplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.BankRobber.BankRobber.DAO.CustomerDAO;
import com.BankRobber.BankRobber.Database.DBOperation;
import com.BankRobber.BankRobber.Models.Customer;



public class customerDAOImpl implements CustomerDAO {
	
	DBOperation dbc = new DBOperation();
	Customer customer;
	
	public List<Customer>FindCustomerName()
	{
		try {
		ResultSet rs = dbc.findCustomer();
		List<Customer> customerName = new ArrayList();
		
		if(rs == null)
		{
			return null;
		}
		while(rs.next())
		{
			
				customer = new Customer(rs.getString("customer_name"));
				customerName.add(customer);
		}
			return customerName;
		}catch(SQLException e)
			{
				e.printStackTrace();
				
			}
		return null;
			
		}
	}

