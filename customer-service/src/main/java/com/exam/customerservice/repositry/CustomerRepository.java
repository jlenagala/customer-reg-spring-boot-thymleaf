package com.exam.customerservice.repositry;

import com.exam.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
    @Query("SELECT p FROM Customer p WHERE p.nic LIKE %?1%")
    public List<Customer> search(String nic);
}
