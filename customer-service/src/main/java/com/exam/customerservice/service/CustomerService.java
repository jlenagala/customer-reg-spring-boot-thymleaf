package com.exam.customerservice.service;

import com.exam.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    List<Customer> listAll(String keyword);

}
