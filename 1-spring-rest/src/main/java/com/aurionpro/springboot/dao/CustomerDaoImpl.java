package com.aurionpro.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.springboot.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	//private SessionFactory sessionFactory;
	private EntityManager entityManager;

	@Override
	public List<Customer> getCustomers() {
		Session currentSession = entityManager.unwrap(Session.class);
		List<Customer> resultList = currentSession.createQuery("from Customer order by firstName", Customer.class)
				.getResultList();
		return resultList;
		
	}

//	@Override
//	public Customer getCustomerById(int customerId) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		Customer customer = currentSession.get(Customer.class, customerId);
//		return customer;
//	}
//	
//	@Override
//	public void addCustomer(Customer customer) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		currentSession.saveOrUpdate(customer);
//	}
//
//	@Override
//	public void deleteCustomer(int customerId) {
//		Session currenSession= sessionFactory.getCurrentSession();
//		Query createQuery = currenSession.createQuery("delete from Customer where id=:id");
//		createQuery.setParameter("id", customerId);
//		createQuery.executeUpdate();
//		
//	}

}