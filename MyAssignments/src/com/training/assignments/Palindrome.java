package com.training.assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int add = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            add = (add*10)+r;
            n = n/10;
        }
        if(temp==add)
            System.out.println("Given number is a Palindrome number.");
        else
            System.out.println("Given number is Not a palindrome");
    }
}
