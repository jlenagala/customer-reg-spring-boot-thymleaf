package com.exam.customerservice.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String age;
    private String nic;
    private String annualincome;
    private String username;
    private String password;
    private String remarks;
    private String firstName;
    private String lastName;

}
