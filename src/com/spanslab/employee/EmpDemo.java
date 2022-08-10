package com.spanslab.employee;

public class EmpDemo {

    public static void main(String[] args) {

        Employee emp1=new Employee();
        Employee emp2=new Employee();

        emp1.empId=101;
        emp1.empName="John";
        emp1.empSalary=5000;

        emp2.empId=102;
        emp2.empName="Peter";
        emp2.empSalary=9000;


        System.out.println(emp2.empName);

        emp2.displayEmployeeDetail();

        emp1.displayEmployeeDetail();
    }
}
