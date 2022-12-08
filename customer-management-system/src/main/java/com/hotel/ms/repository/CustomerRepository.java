package com.hotel.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.ms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
