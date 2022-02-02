package com.company.models;

import com.company.common.Person;
import com.company.enums.Gender;
import com.company.enums.Qualification;
import com.company.enums.Role;

public class Applicant extends Person {

    private Qualification qualification;
    private Role positionAppliedTo;

    public Applicant(String firstName, String lastName, String address, Gender gender, Qualification qualification, Role positionAppliedTo) {
        super(firstName, lastName, address, gender);
        this.qualification = qualification;
        this.positionAppliedTo = positionAppliedTo;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Role getPositionAppliedTo() {
        return positionAppliedTo;
    }

    public void setPositionAppliedTo(Role positionAppliedTo) {
        this.positionAppliedTo = positionAppliedTo;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address='" + getAddress()+ '\'' +
                ", gender=" + getGender() +
                "qualification=" + qualification +
                ", positionAppliedTo=" + positionAppliedTo +
                '}';
    }
}
