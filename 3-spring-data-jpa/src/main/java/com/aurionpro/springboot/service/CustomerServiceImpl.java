package com.aurionpro.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.springboot.dao.CustomerDao;
import com.aurionpro.springboot.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public List<Customer> findAll() {
		
		return customerDao.findAll();
	}

	@Transactional
	@Override
	public Customer findById(int customerID) {
		Optional<Customer> result = customerDao.findById(customerID);
		
		if(result.isPresent()) {
			return result.get();
		}
		else {
			throw new RuntimeException("Id not found");

		}
		
	}

	@Transactional
	@Override
	public void save(Customer customer) {
		
		customerDao.save(customer);
	}

	@Transactional
	@Override
	public void deleteById(int customerID) {
		
		   customerDao.deleteById(customerID);
	}

}
