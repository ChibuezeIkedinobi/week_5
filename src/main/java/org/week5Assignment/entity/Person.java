package org.week5Assignment.entity;

import org.week5Assignment.enums.Role;

public class Person {

    private String name;
    private Role role;

    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getRole() + ": " + getName();
    }
}
