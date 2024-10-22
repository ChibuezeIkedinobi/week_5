package org.queuei;

import org.queuei.enums.MealType;
import org.queuei.model.Cafeteria;
import org.queuei.model.Decadevs;
import org.queuei.service.impl.CafeteriaServiceImpl;

public class Main{
    public static void main(String[] args) {

        // create some sample devs(male and female)
        Decadevs male1 = new Decadevs("Simon Awaogu", false, true);
        Decadevs female1 = new Decadevs("Muminat Adefabi", true, false);

        //create a sample meal
        Cafeteria spaghetti = new Cafeteria(MealType.SPAGHETTI);
        Cafeteria fried_rice = new Cafeteria(MealType.FRIED_RICE);

        //create a cafeteria impl instances
        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        // Add male and female devs to the cafeteria queue to collect meal
        cafeteriaService.addDevsToQueue(male1);
        cafeteriaService.addDevsToQueue(female1);

        //Give out meal
        System.out.println(cafeteriaService.collectMeal(spaghetti));
        System.out.println(cafeteriaService.collectMeal(fried_rice));
    }
}
