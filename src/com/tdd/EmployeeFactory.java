package com.tdd;

public abstract class EmployeeFactory {
    private Employee employee;


    public Employee createEmployeeType(String name) {
        if (name=="W") {
            employee = new ExpeDev();

        } else if(name=="X"){
            employee = new TraineeDev();
        }else{
            employee = new TraineeQa();
        }
        return null;
    }
}
