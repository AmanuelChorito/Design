package com.tdd;

public  class EmployeeFactory {

private Employee employee=null;

    public Employee createEmployeeType(String name) {

        if (name.equals("W")) {
            System.out.println("Expe dev");
           employee= new ExpeDev();

        } else if(name.equals("X")){
            employee = new TraineeDev();
        }else{
            employee = new TraineeQa();
        }
        return employee;
    }
}
