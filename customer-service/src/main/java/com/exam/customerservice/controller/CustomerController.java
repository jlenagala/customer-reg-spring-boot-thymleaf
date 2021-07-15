package com.exam.customerservice.controller;

import com.exam.customerservice.model.Customer;
import com.exam.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("nic") String nic) {
        List<Customer> listCustomers = customerService.listAll(nic);
        model.addAttribute("listCustomers", listCustomers);
        model.addAttribute("nic", nic);

        return "index";
    }
    @RequestMapping("/new")
    public String addnew(Model model) {
        Customer customer=new Customer();
        model.addAttribute("customer",customer);

        return "index";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "index";
    }
}

