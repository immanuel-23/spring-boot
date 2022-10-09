package com.aurionpro.springboot.dao;

import java.util.List;

import com.aurionpro.springboot.entity.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();

//	Customer getCustomerById(int customerId);
//
//	void addCustomer(Customer customer);
//
//	void deleteCustomer(int customerId);
}