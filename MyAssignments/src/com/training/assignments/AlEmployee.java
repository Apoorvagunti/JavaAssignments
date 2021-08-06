package com.training.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Apoorva", "324,adfdg India", 27000.0));
        list.add(new Employee(102, "Deepti", "234,asgsag street, India", 35000.0));
        list.add(new Employee(103, "Bhanu", "345,adfgadg, India", 44000.0));
        list.add(new Employee(104, "Sowjanya", "456 street, India", 24000.0));

        Iterator<Employee> it = list.iterator();
        int sId = 102;
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == sId)
                System.out.println(emp);
        }
    }
}
