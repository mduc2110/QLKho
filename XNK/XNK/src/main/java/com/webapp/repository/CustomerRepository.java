package com.webapp.repository;

import java.util.List;

import com.webapp.entity.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
	Customer findById(String id);
    boolean insert(Customer customer);
    boolean delete(String id);
    boolean update(Customer customer);
}
