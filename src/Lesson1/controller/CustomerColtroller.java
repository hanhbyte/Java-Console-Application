package Lesson1.controller;

import Lesson1.model.Customer;
import Lesson1.service.CustomerService;

import java.util.List;

public class CustomerColtroller {
    CustomerService customerService = new CustomerService();
    public void creatCustomer (Customer customer){
        customerService.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerService.delete(customer);
    }

    public void paymentCustomer(Customer customer){
        customerService.payment(customer);
    }

    public List<Customer> showListCustomer() {
        return customerService.findAll();
    }

}
