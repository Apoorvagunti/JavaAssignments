package com.training.assignments;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkdlstEx1 {
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public LinkedList<Integer> saveEvenNumbers(int N) {
        list = new LinkedList<Integer>();
        //check if even or not and save in list
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) list.add(i);
        }
        // return the list of even numbers
        return list;
    }

    public LinkedList<Integer> printEvenNumbers() {
        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (int item : list) {
            newList.add(item * 2);
            System.out.println(item * 2);
        }

        return newList;
    }

    public static void main(String[] args) {
        LinkdlstEx1 ll1 = new LinkdlstEx1();

        ll1.saveEvenNumbers(15);

        ll1.printEvenNumbers();


    }

}
