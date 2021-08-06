package com.training.assignments;

public class Employee {
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Employee(int id, String name, String address, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return "Employee Details :" + "\n"+
                "id=" + id + "\n"+
                "name=" + name + "\n"+
                "address=" + address + "\n"+
                "salary=" + salary ;
    }
}
