package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Staff> membersOfDepartment;

    public Department (String name) {
        this.name = name;
        this.membersOfDepartment = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Staff> getMembersOfDepartment() {
        return membersOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", membersOfDepartment=" + membersOfDepartment +
                '}';
    }
}
