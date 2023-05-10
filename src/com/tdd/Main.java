package com.tdd;

public class Main {




    public static void main(String[] args) {
	// write your code here
        EmployeeFactory employee=new EmployeeFactory() ;
       String output= employee.createEmployeeType("W").getName();
        System.out.println(output);
    }

}
