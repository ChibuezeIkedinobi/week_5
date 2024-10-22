package org.queuei.service.impl;

import org.queuei.model.Cafeteria;
import org.queuei.model.Decadevs;
import org.queuei.service.CafeteriaService;
import org.queuei.utils.DecadevComparator;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {
    PriorityQueue<Decadevs> devsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        devsOnQueue = new PriorityQueue<>(new DecadevComparator());
    }

    @Override
    public void addDevsToQueue(Decadevs devs) {
        devsOnQueue.add(devs);
    }

    @Override
    public String collectMeal(Cafeteria meal) {

        if (devsOnQueue.isEmpty()) {
            return "No devs is on queue yet";
        }
        Decadevs decadevs = devsOnQueue.poll();
        return decadevs.getName()+" has taken "+ meal.getMealType()+".";
    }
}
