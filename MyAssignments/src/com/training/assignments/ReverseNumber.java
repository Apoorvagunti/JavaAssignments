package com.training.assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){

    Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
    int number = in.nextInt();
    int reverseNum = 0;
    while(number !=0)

    {

        int lastDigit = number % 10;

        reverseNum = reverseNum * 10 + lastDigit;

        number = number / 10;

    }

		System.out.println("Reversed number : "+reverseNum);

    }

}
