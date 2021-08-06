package com.training.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this is string ex1");
        list.add("storing only strings");
        list.add("hence solved");
        list.add("end of program");

        printAll(list);
    }

    public static void printAll(List<String> list) {
        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
