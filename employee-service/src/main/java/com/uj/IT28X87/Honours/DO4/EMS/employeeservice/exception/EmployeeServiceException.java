package com.uj.IT28X87.Honours.DO4.EMS.employeeservice.exception;

public class EmployeeServiceException extends Exception{

    public EmployeeServiceException(){
        super();
    }

    public EmployeeServiceException(String message){
        super(message);
    }

    public EmployeeServiceException(String message,Throwable throwable){
        super(message, throwable);
    }
}
