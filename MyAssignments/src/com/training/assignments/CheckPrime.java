package com.training.assignments;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){

        System.out.println("Enter the number to check if prime:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Boolean flag = true;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                // System.out.println("Entered Number "+num+" is not prime");
                flag = false;
                break;
            }
        }if(flag == Boolean.TRUE)
             System.out.println("Entered Number "+num+" is  prime");

            else
                System.out.println("Number is not prime"+num);
        }

}
