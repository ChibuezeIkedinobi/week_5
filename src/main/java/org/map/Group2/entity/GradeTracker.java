package org.map.Group2.entity;

import org.map.Group2.service.GradeInterface;

import java.util.HashMap;

public class GradeTracker implements GradeInterface {

    private HashMap<Integer, Double> studentGrades = new HashMap<>();

    public GradeTracker(HashMap<Integer, Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    @Override
    public void addGrade(int studentId, double grade) {
        studentGrades.put(studentId, grade);
    }

    @Override
    public double getGrade(int studentId) {
        if (studentGrades.containsKey(studentId)) {
            return studentGrades.get(studentId);
        }
        return -1000.0d;
    }

}
