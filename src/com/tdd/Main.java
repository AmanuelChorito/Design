package com.tdd;

public class Main {




    public static void main(String[] args) {
	// write your code here
        EmployeeFactory employee=new EmployeeFactory() {
            @Override
            public Employee createEmployeeType(String name) {
                return super.createEmployeeType(name);
            }
        };
        employee.createEmployeeType("Abebe").getName();

    }

}
