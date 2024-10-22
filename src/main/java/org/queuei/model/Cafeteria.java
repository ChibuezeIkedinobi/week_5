package org.queuei.model;

import org.queuei.enums.MealType;

public class Cafeteria {

    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
