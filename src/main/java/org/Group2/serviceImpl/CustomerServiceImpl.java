package org.Group2.serviceImpl;

import org.Group2.entity.Customer;
import org.Group2.service.CustomerService;
import org.Group2.utils.AgeComparator;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CustomerServiceImpl implements CustomerService {

    PriorityQueue<Customer> customersOnQueue = new PriorityQueue<>();

    public CustomerServiceImpl() {
        customersOnQueue = new PriorityQueue<>(new AgeComparator());
    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        if (!customersOnQueue.contains(customer)) {
            customersOnQueue.add(customer);
        } else {
            System.out.println("Customer "+ customer.getName() + " is already in the Queue");
        }
    }

    @Override
    public void attendToCustomer() {
        if (customersOnQueue.isEmpty()) {
            System.out.println("No customer is on queue");
        }

        Iterator<Customer> customerIterator = customersOnQueue.iterator();

        while (customerIterator.hasNext()) {
            Customer customer = customersOnQueue.poll();
            System.out.println(customer.getName()+" has been attended according to Simon's requirements");
        }
    }

//    @Override
//    public String attendToCustomer() {
//        if (customersOnQueue.isEmpty()) {
//            return "No customer is on queue";
//        }
//        Iterator<Customer> customerIterator = customersOnQueue.iterator();
//        while (customerIterator.hasNext()) {
//
//        }
//        Customer customer = customersOnQueue.poll();
//        return customer.getName()+" has been attended according to Simon's requirements";
//    }
}
