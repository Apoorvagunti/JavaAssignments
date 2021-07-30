package com.training.assignments;

import java.util.Scanner;

public class PrintColor {
    public static void main(String[] args){

        System.out.println("Enter the input month number");
        Scanner scan = new Scanner(System.in);
        char code = scan.next().charAt(0);
        switch(code)
        {
            case 'R':
                System.out.println ("The name of Color with code 'R' is Red");
                break;
            case 'B':
                System.out.println ("The name of Color with code 'B' is Blue");
                break;
            case 'G':
                System.out.println ("The name of Color with code 'G' is Green");
                break;
            case 'O':
                System.out.println ("The name of Color with code 'O' is Orange");
                break;
            case 'Y':
                System.out.println ("The name of Color with code 'Y' is Yellow");
                break;
            case 'W':
                System.out.println ("The name of Color with code 'W' is White");
                break;


            default:
                System.out.println ("You have entered an invalid Code");

        }
    }
}
