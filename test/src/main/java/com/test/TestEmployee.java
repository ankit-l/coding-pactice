package com.test;

class Employee {
    public void show(){
        System.out.println("Show() method call in Employee");
    }
}

class BankEmployee extends Employee {
    void calculateSalary() {
        System.out.println("calculateSalary() method");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new BankEmployee();
        employee.show();
        ((BankEmployee) employee).calculateSalary();
    }
}

