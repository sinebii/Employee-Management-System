package com.company.recruitment;

import com.company.models.Company;
import com.company.models.Staff;
import com.company.models.Applicant;
import com.company.exceptions.StaffNotAuthorizedException;

import java.util.List;

public interface Recruitment {
    void singleHire (Applicant applicant, Staff staff, Company company) throws StaffNotAuthorizedException;
    void multipleHires (List<Applicant> applicants, Staff staff, Company company) throws StaffNotAuthorizedException;
}
