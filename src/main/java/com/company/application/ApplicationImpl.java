package com.company.application;

import com.company.models.Applicant;
import com.company.models.Company;
import com.company.exceptions.ApplicantAlreadyAppliedException;

public class ApplicationImpl implements Application {

    @Override
    public void apply (Applicant applicant, Company company) throws ApplicantAlreadyAppliedException {
        if(company.getApplicants().contains(applicant)){
            throw new ApplicantAlreadyAppliedException("You have already applied for this position");
        }
        company.getApplicants().add(applicant);
        System.out.println(applicant.getFirstName() + " has successfully applied for the role of "
                + applicant.getPositionAppliedTo() + " at " + company.getName());
    }
}
