package org.example.employee;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private BigDecimal salary;
    private String employeeName;
    private String getEmployeeManagerName;

    public Employee(BigDecimal salary, String employeeName, String getEmployeeManagerName) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.getEmployeeManagerName = getEmployeeManagerName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGetEmployeeManagerName() {
        return getEmployeeManagerName;
    }

    public void setGetEmployeeManagerName(String getEmployeeManagerName) {
        this.getEmployeeManagerName = getEmployeeManagerName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", employeeName='" + employeeName + '\'' +
                ", getEmployeeManagerName='" + getEmployeeManagerName + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return salary.equals(employee.salary) && employeeName.equals(employee.employeeName) && Objects.equals(getEmployeeManagerName, employee.getEmployeeManagerName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(salary, employeeName, getEmployeeManagerName);
//    }
}
