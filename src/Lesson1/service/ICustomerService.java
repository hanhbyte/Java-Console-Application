package Lesson1.service;

import Lesson1.model.Customer;

import java.util.List;

public interface ICustomerService {
    void save(Customer customer);

    void delete(Customer customer);

    void payment(Customer customer);

    List<Customer> findAll();
    }
