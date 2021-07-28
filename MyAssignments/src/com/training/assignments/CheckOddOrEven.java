package com.training.assignments;

import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args){

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        number = scan.nextInt();
        scan.close();
        if(number % 2 == 0){
            System.out.println("Given number is Even");
        }

        else
            System.out.println("Given number is odd");

    }
}
