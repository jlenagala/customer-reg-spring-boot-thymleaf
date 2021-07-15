package com.exam.customerservice.service;

import com.exam.customerservice.model.Customer;
import com.exam.customerservice.repositry.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    public List<Customer> listAll(String keyword) {
        if (keyword != null) {
            return customerRepository.search(keyword);
        }
        return customerRepository.findAll();
    }


}

