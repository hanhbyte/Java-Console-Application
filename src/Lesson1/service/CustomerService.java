package Lesson1.service;

import Lesson1.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Binh", "12/8/1997", 1234));
        customerList.add(new Customer("Cuong", "12/8/1993", 3456));
        customerList.add(new Customer("Dai", "12/8/1995", 7896));
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerList.remove(customer);
    }

    public void payment(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
