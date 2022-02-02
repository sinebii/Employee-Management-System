package com.company.exceptions;

public class StaffNotAuthorizedException extends Exception {
    public StaffNotAuthorizedException(String message) {
        super(message);
    }
}
