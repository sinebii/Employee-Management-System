package com.company.recruitment;

import com.company.models.Company;
import com.company.models.Staff;
import com.company.models.Applicant;
import com.company.exceptions.StaffNotAuthorizedException;


import java.util.List;
import java.util.stream.Collectors;

import static com.company.enums.Qualification.*;
import static com.company.enums.Role.*;

public class RecruitmentImpl implements Recruitment {

    @Override
    public void singleHire(Applicant applicant, Staff staff, Company company) throws StaffNotAuthorizedException {
        if(staff.getRole().equals(HR) || staff.getRole().equals(CEO)){
            if(applicant.getQualification().equals(MSc) || applicant.getQualification().equals(BSc)){
                convertApplicantToStaffAndAddToCompany(company, applicant);
            }
        }
        else {
            throw new StaffNotAuthorizedException("You must be an HR or a CEO to perform this operation");
        }

    }

    @Override
    public void multipleHires(List<Applicant> applicants, Staff staff, Company company) throws StaffNotAuthorizedException {
        if(!staff.getRole().equals(HR) || !staff.getRole().equals(CEO)){
            throw new StaffNotAuthorizedException("You must be an HR or a CEO to perform this operation");
        }

        applicants.stream().filter(applicant ->
                applicant.getQualification().equals(MSc) || applicant.getQualification().equals(BSc)
        ).collect(Collectors.toList()).forEach(applicant -> convertApplicantToStaffAndAddToCompany(company, applicant));

    }

    private void convertApplicantToStaffAndAddToCompany(Company company, Applicant applicant) {
        Staff newStaff = new Staff();
        newStaff.setFirstName(applicant.getFirstName());
        newStaff.setLastName(applicant.getLastName());
        newStaff.setAddress(applicant.getAddress());
        newStaff.setGender(applicant.getGender());
        newStaff.setRole(applicant.getPositionAppliedTo());

        company.getStaffs().add(newStaff);
        company.getApplicants().remove(applicant);
    }

}
