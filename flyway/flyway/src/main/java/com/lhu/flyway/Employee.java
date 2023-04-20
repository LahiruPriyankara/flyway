package com.lhu.flyway;

import javax.persistence.*;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String employeeEmail;
    private String employeeEmailAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeEmailAge() {
        return employeeEmailAge;
    }

    public void setEmployeeEmailAge(String employeeEmailAge) {
        this.employeeEmailAge = employeeEmailAge;
    }
}
