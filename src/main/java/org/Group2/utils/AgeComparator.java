package org.Group2.utils;

import org.Group2.entity.Customer;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer t1, Customer t2) {

        if (t1.getAge() < t2.getAge()) {  // if true, t1 will come after t2(descending age order)
            return 1;
        } else if (t1.getAge() > t2.getAge()) {  // if true, t2 will come after t1(ascending age order)
            return -1;  //
        } else {
            return 0;  //  t1 and t2 are equal and will be sorted using FIFO
        }
    }
}
