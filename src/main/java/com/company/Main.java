package com.company;

import com.company.models.Applicant;
import com.company.application.Application;
import com.company.application.ApplicationImpl;
import com.company.enums.Gender;
import com.company.enums.Qualification;
import com.company.enums.Role;
import com.company.exceptions.ApplicantAlreadyAppliedException;
import com.company.exceptions.StaffNotAuthorizedException;
import com.company.models.Company;
import com.company.models.Department;
import com.company.models.Staff;
import com.company.recruitment.Recruitment;
import com.company.recruitment.RecruitmentImpl;

public class Main {

    public static void main(String[] args) throws StaffNotAuthorizedException, ApplicantAlreadyAppliedException {
        Company decagon = new Company("Decagon", "Edo Tech Park");
        Recruitment recruitment = new RecruitmentImpl();
        Application application = new ApplicationImpl();
        Applicant chisom = new Applicant("Chisom", "Ada", "Tech Park", Gender.FEMALE, Qualification.MSc, Role.JUNIOR_DEVELOPER);
        Department programs = new Department("programs");
        Staff ceo = new Staff("Chika", "Nwobi", "Lekki", Gender.MALE, null, Role.CEO);
        Staff hr = new Staff("Temi", "Adekunle", "Lekki", Gender.FEMALE, null, Role.HR);
        Staff peter = new Staff("Peter", "Abiodun", "Lekki", Gender.MALE, programs, Role.JUNIOR_DEVELOPER);

        application.apply(chisom, decagon);
        System.out.println(decagon.getApplicants());
        recruitment.singleHire(chisom, hr, decagon);
        System.out.println(decagon.getApplicants());
        System.out.println(decagon.getStaffs());



    }
}
