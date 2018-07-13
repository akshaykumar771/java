package com.akshay.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
    int employeeNumber;
    String employeeName;
    String joiningDate;

    Employee() {
        this.employeeNumber = 1;
        this.employeeName = "Akshay";
        this.joiningDate = "13/05/2018";

    }

    public Employee(int employeeNumber, String employeeName, String joiningDate) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.joiningDate = joiningDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        System.out.println("Employee Number \t\t\t Employee Name \t\t\t Joining Date");
        Employee emp1 = new Employee();
        //System.out.println(emp1.employeeNumber + "\t\t\t" + emp1.employeeName + "\t\t\t" + emp1.joiningDate);
        Employee emp2 = new Employee(2, "Syed", "12/12/2018");
        //System.out.println(emp2.employeeNumber + "\t\t\t" + emp2.employeeName + "\t\t\t" + emp2.joiningDate);
        Employee emp3 = new Employee(3,"Sandesha","1/12/2017");
        Employee emp4 = new Employee(4,"Ashwin","30/06/2018");
        Employee emp5 = new Employee(5,"Anoop","10/10/2016");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        for (Employee y : employees) {
            System.out.println(y.getEmployeeNumber() + "\t\t\t" + y.getEmployeeName() + "\t\t\t" + y.getJoiningDate());

        }
    }
}
