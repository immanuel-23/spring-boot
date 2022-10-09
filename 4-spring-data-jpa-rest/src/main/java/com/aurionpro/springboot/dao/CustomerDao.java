package com.aurionpro.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.springboot.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
