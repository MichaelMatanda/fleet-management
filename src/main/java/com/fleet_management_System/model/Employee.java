package com.fleet_management_System.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class Employee  extends Person{
    @ManyToOne
    @JoinColumn(name="employeetypeid",insertable = false,updatable = false)
    private EmployeeType employeeType;
    private Integer employeetypeid;
    private String photo;
    private String username;
    @ManyToOne
    @JoinColumn(name="jobtitled",insertable = false,updatable = false)
    private JobTitle jobTitle;
    private Integer jobtitleid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date hireDAte;

}
