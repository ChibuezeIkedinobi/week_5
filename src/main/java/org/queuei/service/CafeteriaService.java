package org.queuei.service;

import org.queuei.model.Cafeteria;
import org.queuei.model.Decadevs;

public interface CafeteriaService {

    void addDevsToQueue(Decadevs decadevs);

    String collectMeal(Cafeteria meal);

}
