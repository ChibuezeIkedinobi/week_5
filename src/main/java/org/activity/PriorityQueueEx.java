package org.activity;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("ONE");
        queue.add("TWO");
        queue.add("SIX");
        queue.add("THREE");
        queue.add("FOUR");
        queue.add("FIVE");

        System.out.println("Head: "+ queue.element());

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
