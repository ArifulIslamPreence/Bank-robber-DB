package com.BankRobber.BankRobber.DAO;

import java.util.List;

import com.BankRobber.BankRobber.Database.DBOperation;
import com.BankRobber.BankRobber.Models.Customer;

public interface CustomerDAO {

	List<Customer>FindCustomerName();

}
