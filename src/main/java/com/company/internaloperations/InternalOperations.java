package com.company.internaloperations;

import com.company.enums.Role;
import com.company.exceptions.StaffNotAuthorizedException;
import com.company.models.*;

public interface InternalOperations {
    void addStaffToDepartment (Staff staff, Department department);
    void fireStaff (Company company, Staff admin, Staff staff ) throws StaffNotAuthorizedException;
    void promoteStaff (Staff admin, Staff staff, Role role) throws StaffNotAuthorizedException;
    void givePraise (Staff admin, Staff staff, Praise praise) throws StaffNotAuthorizedException;
    void issueQuery (Staff admin, Staff staff, Query query) throws StaffNotAuthorizedException;
}
