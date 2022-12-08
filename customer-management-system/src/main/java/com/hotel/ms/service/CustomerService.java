package com.hotel.ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.ms.entity.Customer;

@Service
public interface CustomerService {
	
	List<Customer> getAllCustomers();

	Customer saveCustomer(Customer customer);

	Customer getCustomerById(Long id);

	Customer updateCustomer(Customer customer);

	void deleteCustomerById(Long id);

}
