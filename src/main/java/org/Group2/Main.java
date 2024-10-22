package org.Group2;

import org.Group2.entity.Customer;
import org.Group2.serviceImpl.CustomerServiceImpl;

import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Emmanuel" , 45);
        Customer customer2 = new Customer("Tomi" , 12);
        Customer customer3 = new Customer("Muminat" , 3);
        Customer customer4 = new Customer("Ikedinobi" , 100);
        Customer customer5 = new Customer("Wisdom" , 100);

        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.addCustomerToQueue(customer1);
        customerService.addCustomerToQueue(customer2);
        customerService.addCustomerToQueue(customer3);
        customerService.addCustomerToQueue(customer4);
        customerService.addCustomerToQueue(customer5);

        customerService.attendToCustomer();

//        System.out.println(customerService.attendToCustomer());
//        System.out.println(customerService.attendToCustomer());
//        System.out.println(customerService.attendToCustomer());




    }
}
