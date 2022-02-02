package com.company.models;

import com.company.common.Person;
import com.company.enums.Gender;
import com.company.enums.Role;


public class Staff extends Person {
    private Department department;
    private Role role;
    private PerformanceMetrics performanceMetrics;

    public Staff (){

    }

    public Staff (String firstName, String lastName, String address, Gender gender, Department department, Role role) {
        super(firstName, lastName, address, gender);
        this.role = role;

        if(role.equals(Role.CEO) || role.equals(Role.HR)){
            this.department = null;
            this.performanceMetrics = null;
        }
        else {
            this.department = department;
            this.performanceMetrics = new PerformanceMetrics();
        }

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public PerformanceMetrics getPerformanceMetrics() {
        return performanceMetrics;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address='" + getAddress()+ '\'' +
                ", gender=" + getGender() +
                "department=" + department +
                ", role=" + role +
                ", performanceMetrics=" + performanceMetrics +
                '}';
    }
}
