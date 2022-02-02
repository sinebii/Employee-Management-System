package com.company.models;


import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private final List<Staff> staffs;
    private final List<Applicant> applicants;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.staffs = new ArrayList<>();
        this.applicants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }


    public List<Applicant> getApplicants() {
        return applicants;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", staffs=" + staffs +
                ", applicants=" + applicants +
                '}';
    }
}
