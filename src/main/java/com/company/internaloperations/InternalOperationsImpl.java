package com.company.internaloperations;

import com.company.enums.Role;
import com.company.exceptions.StaffNotAuthorizedException;
import com.company.models.*;

public class InternalOperationsImpl implements InternalOperations {

    @Override
    public void addStaffToDepartment(Staff staff, Department department) {
        department.getMembersOfDepartment().add(staff);
    }

    @Override
    public void fireStaff(Company company, Staff admin, Staff staff) throws StaffNotAuthorizedException {
        if (admin.getRole().equals(Role.HR) || admin.getRole().equals(Role.CEO)) {
            if (staff.getPerformanceMetrics().getQueries().size() >= 2 ||
                    staff.getPerformanceMetrics().getQueries().stream().anyMatch(query -> query.getQueryReason().equals("Sexual Harassment".toLowerCase()))) {
                staff.getDepartment().getMembersOfDepartment().remove(staff);
                company.getStaffs().remove(staff);
                System.out.println(staff.getFirstName() + " has been fired");
            }
        } else {
            throw new StaffNotAuthorizedException("You are not authorized to perform this operation");
        }
    }

    @Override
    public void promoteStaff (Staff admin, Staff staff, Role role) throws StaffNotAuthorizedException {
        if(admin.getRole().equals(Role.HR) || admin.getRole().equals(Role.CEO)){
            if (staff.getPerformanceMetrics().getPraises().size() >= 3){
                staff.setRole(role);
            }
        } else {
            throw new StaffNotAuthorizedException("You are not authorized to perform this operation");
        }
    }

    @Override
    public void givePraise(Staff admin, Staff staff, Praise praise) throws StaffNotAuthorizedException {
        if(admin.getRole().equals(Role.HR)){
            staff.getPerformanceMetrics().getPraises().add(praise);
        }
        else {
            throw new StaffNotAuthorizedException("You are not authorized to perform this operation");
        }
    }

    @Override
    public void issueQuery(Staff admin, Staff staff, Query query) throws StaffNotAuthorizedException {
        if(admin.getRole().equals(Role.HR)){
            staff.getPerformanceMetrics().getQueries().add(query);
        }
        else {
            throw new StaffNotAuthorizedException("You are not authorized to perform this operation");
        }
    }
}
