package com.tdd;

public class Main {




    public static void main(String[] args) {
	// write your code here
        EmployeeFactory employee=new EmployeeFactory() ;
        String input= "W";
       String output= employee.createEmployeeType(input).getName();
        System.out.println(output);
    }

}
