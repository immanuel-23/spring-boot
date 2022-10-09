package com.aurionpro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.springboot.entity.Customer;
import com.aurionpro.springboot.service.CustomerService;

@RestController
@RequestMapping("/app1")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {

		return customerService.findAll();

	}

	@GetMapping("/customers/{customerID}")
	public Customer getCustomerById(@PathVariable int customerID) {
		Customer customer = customerService.findById(customerID);
		return customer;

	}

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {

		customer.setId(0);
		customerService.save(customer);

		return customer;

	}

	@PutMapping("/customers")
	public Customer putCustomer(@RequestBody Customer customer) {

		customerService.save(customer);

		return customer;

	}

	@DeleteMapping("/customers/{customerID}")
	public void deleteCustomerById(@PathVariable int customerID) {
		customerService.deleteById(customerID);

	}

}
