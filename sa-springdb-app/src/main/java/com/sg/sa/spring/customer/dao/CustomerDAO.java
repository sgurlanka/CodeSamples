package com.sg.sa.spring.customer.dao;

import com.sg.sa.spring.customer.model.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);

	public Customer findByCustomerId(int custId);
}
