package com.BankRobber.BankRobber.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.BankRobber.BankRobber.Models.Customer;

public interface CustomerView {

	List<Customer> viewCustomerName();
}
