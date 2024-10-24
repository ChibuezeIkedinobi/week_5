package org.week5Assignment.util;

import org.week5Assignment.entity.Person;
import org.week5Assignment.enums.Role;

import java.util.Comparator;

public class RoleComparator implements Comparator<Person> {

    @Override
    public int compare(Person t1, Person t2) {
        if (t1.getRole() == t2.getRole()) {  // same role
            return 0;
        }
        if (t1.getRole() == Role.TEACHER && t2.getRole() == Role.STUDENT) { // If t1 is a TEACHER and t2 is a STUDENT, t1 has higher priority
            return -1;
        }
        return 1; // If t1 is a STUDENT and t2 is a TEACHER, t2 has higher priority
    }

}
