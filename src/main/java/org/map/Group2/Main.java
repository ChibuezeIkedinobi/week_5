package org.map.Group2;

import org.map.Group2.entity.GradeTracker;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Double> studentGrades = new HashMap<>();

        GradeTracker gradeTracker = new GradeTracker(studentGrades);

        gradeTracker.addGrade(1, 80.6);
        gradeTracker.addGrade(2, 10.2);
        gradeTracker.addGrade(3, 90.0);
        gradeTracker.addGrade(4, 55.6);
        gradeTracker.addGrade(5, 11.6);

        for (Map.Entry grades : studentGrades.entrySet()) {
            System.out.println(grades.getKey()+" - "+grades.getValue());
        }

    }
}
