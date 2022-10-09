package com.aurionpro.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.springboot.dao.CustomerDao;
import com.aurionpro.springboot.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

//	@Override
//	@Transactional
//	public Customer getCustomerById(int customerId) {
//		// TODO Auto-generated method stub
//		return customerDao.getCustomerById(customerId);
//	}
//	
//	@Override
//	@Transactional
//	public void addCustomer(Customer customer) {
//		customerDao.addCustomer(customer);
//	}
//
//	@Override
//	@Transactional
//	public void deleteCustomer(int customerId) {
//		customerDao.deleteCustomer(customerId);
//	}

}