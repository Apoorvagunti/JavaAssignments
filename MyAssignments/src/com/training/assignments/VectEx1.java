package com.training.assignments;

import java.util.Iterator;
import java.util.Vector;

public class VectEx1 {
    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Apoorva", "5345, the sdf, India", 23500.0));
        list.add(new Employee(102, "Deepti", "234, adhgk, India", 35400.0));
        list.add(new Employee(103, "Hemanth", "345 , asfgkja, India", 457500.0));
        list.add(new Employee(104, "Shweta", "456 , gjhakgjh, India", 967500.0));

        Iterator<Employee> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }

}
