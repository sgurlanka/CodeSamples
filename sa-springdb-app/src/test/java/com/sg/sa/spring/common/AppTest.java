package com.sg.sa.spring.common;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sg.sa.spring.customer.dao.CustomerDAO;
import com.sg.sa.spring.customer.model.Customer;

public class AppTest {
	@Test
	public void testFindByCustomerId() {
		final String customerName = "Suraj Gurlanka";
		final int customerAge = 42;
		
		// Load spring context
		final ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		// Get CustomerDAO from the spring context
		final CustomerDAO customerDao = (CustomerDAO) context.getBean("customerDAO");
		
		// Customer data to insert into database
		final Customer customerDataToDb = new Customer(2, customerName, customerAge);
		customerDao.insert(customerDataToDb);
		
		// Retrieved data from DB
		final Customer customerDataFromDb = customerDao.findByCustomerId(2);
		
		// Assert to validate data retrieved from database
		Assert.assertEquals(customerName, customerDataFromDb.getName());
		Assert.assertEquals(customerAge, customerDataFromDb.getAge());
	}	
}
