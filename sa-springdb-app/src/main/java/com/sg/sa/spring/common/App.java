package com.sg.sa.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sg.sa.spring.customer.dao.CustomerDAO;
import com.sg.sa.spring.customer.model.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		// Customer customer = new Customer(2, "Suraj Gurlanka", 28);
		// customerDAO.insert(customer);

		Customer customerData = customerDAO.findByCustomerId(1);
		System.out.println(customerData);
	}
}
