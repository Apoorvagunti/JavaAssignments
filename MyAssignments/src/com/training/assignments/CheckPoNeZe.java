package com.training.assignments;

import java.util.Scanner;

public class CheckPoNeZe {

    public static void main(String[] args){

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = scan.nextInt();
        scan.close();
        if(number > 0){
            System.out.println("Given number is postiive");
        }
        else if(number<0){
            System.out.println("Given number is negative");
        }
        else if(number == 0){
            System.out.println("Given number is 0");
        }
        else
            System.out.println("Given number is neither positive nor negative nor zero");

    }
}
