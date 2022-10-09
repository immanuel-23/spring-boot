package com.aurionpro.springboot.service;

import java.util.List;

import com.aurionpro.springboot.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

//	Customer getCustomerById(int customerId);
//
//	void addCustomer(Customer customer);
//
//	void deleteCustomer(int customerId);
}
