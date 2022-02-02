package com.company.application;

import com.company.models.Applicant;
import com.company.models.Company;
import com.company.exceptions.ApplicantAlreadyAppliedException;

public interface Application {
    void apply (Applicant applicant, Company company) throws ApplicantAlreadyAppliedException;
}
