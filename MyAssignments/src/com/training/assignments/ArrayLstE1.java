package com.training.assignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayLstE1 {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> saveEvenNumbers(int N) {
        list = new ArrayList<Integer>();
    //check if even or not and save in list
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) list.add(i);
        }
    // return the list of even numbers
        return list;
    }

    public ArrayList<Integer> printEvenNumbers() {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int item : list) {
            newList.add(item * 2);
            System.out.println(item * 2);
        }

        return newList;
    }

    public static void main(String[] args) {
        ArrayLstE1 al1 = new ArrayLstE1();

        al1.saveEvenNumbers(15);

        al1.printEvenNumbers();


    }


}
